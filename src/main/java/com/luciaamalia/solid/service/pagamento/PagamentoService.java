package com.luciaamalia.solid.service.pagamento;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;

public interface PagamentoService {
    String processarPagamento(PagamentoRequestDTO requestDTO);
}
