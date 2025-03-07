package com.luciaamalia.solid.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PagamentoResponseDTO {

    private Long idPagamento;
    private double valor;
    private String tipoPagamento;

}

