package com.luciaamalia.solid.service.pagamento;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;
import com.luciaamalia.solid.service.notificacao.NotificacaoService;

public class PagamentoServiceImpl implements PagamentoService {

    private final MetodoPagamentoFactory metodoPagamentoFactory;

    private final NotificacaoService notificacaoService;

    public PagamentoServiceImpl(MetodoPagamentoFactory metodoPagamentoFactory,
                                NotificacaoService notificacaoService) {
        this.metodoPagamentoFactory = metodoPagamentoFactory;
        this.notificacaoService = notificacaoService;
    }


    @Override
    public String processarPagamento(PagamentoRequestDTO requestDTO) {
        MetodoPagamento metodo = metodoPagamentoFactory.criarMetodoPagamento(requestDTO.getTipoPagamento());
        String resultado = metodo.pagar(requestDTO.getValor());
        notificacaoService.enviarNotificacao("Pagamento realizado com sucesso");
        return resultado;
    }
}
