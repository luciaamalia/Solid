package com.luciaamalia.solid.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoRequestDTO {

    private String tipoPagamento;
    private double valor;
}
