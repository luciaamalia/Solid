package com.luciaamalia.solid.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagamento {

    @Id
    private Long idPagamento;
    private double valor;
    private String tipoPagamento;
}
