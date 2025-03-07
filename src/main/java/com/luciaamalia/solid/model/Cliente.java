package com.luciaamalia.solid.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    @Id
    private Long idCliente;
    private String nome;
    private String email;
}
