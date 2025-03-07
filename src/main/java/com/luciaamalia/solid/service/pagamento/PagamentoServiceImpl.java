package com.luciaamalia.solid.service.pagamento;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;
import com.luciaamalia.solid.dto.PagamentoResponseDTO;
import com.luciaamalia.solid.model.Pagamento;
import com.luciaamalia.solid.service.notificacao.NotificacaoService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PagamentoServiceImpl implements PagamentoService {

    private final MetodoPagamentoFactory metodoPagamentoFactory;
    private final NotificacaoService notificacaoService;

    public PagamentoServiceImpl(MetodoPagamentoFactory metodoPagamentoFactory,
                                NotificacaoService notificacaoService) {
        this.metodoPagamentoFactory = metodoPagamentoFactory;
        this.notificacaoService = notificacaoService;
    }


    @Override
    public PagamentoResponseDTO processarPagamento(PagamentoRequestDTO requestDTO) {
        MetodoPagamento metodo = metodoPagamentoFactory.criarMetodoPagamento(requestDTO.getTipoPagamento());
        String resultado = metodo.pagar(requestDTO.getValor());
        notificacaoService.enviarNotificacao("Pagamento realizado com sucesso");
        Pagamento pagamento = new Pagamento(
                UUID.randomUUID(), // Gera um ID único (substitua pela lógica real)
                requestDTO.getValor(),
                requestDTO.getTipoPagamento()
        );

        return toResponseDTO(pagamento);
    }
    private PagamentoResponseDTO toResponseDTO(Pagamento pagamento) {
        return new PagamentoResponseDTO(
                pagamento.getIdPagamento(),
                pagamento.getValor(),
                pagamento.getTipoPagamento()
        );
    }
}
