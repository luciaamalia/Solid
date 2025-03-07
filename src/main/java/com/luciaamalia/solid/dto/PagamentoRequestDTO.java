package com.luciaamalia.solid.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoRequestDTO {

    private String tipoPagamento;
    private double valor;
}
