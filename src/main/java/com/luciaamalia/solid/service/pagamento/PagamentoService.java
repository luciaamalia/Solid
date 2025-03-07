package com.luciaamalia.solid.service.pagamento;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;
import com.luciaamalia.solid.dto.PagamentoResponseDTO;

public interface PagamentoService {
    PagamentoResponseDTO processarPagamento(PagamentoRequestDTO requestDTO);
}
