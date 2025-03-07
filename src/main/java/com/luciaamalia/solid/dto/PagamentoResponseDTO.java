package com.luciaamalia.solid.dto;

import lombok.*;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor // Gera um construtor vazio
@AllArgsConstructor
public class PagamentoResponseDTO {

    private UUID idPagamento;
    private double valor;
    private String tipoPagamento;

}

