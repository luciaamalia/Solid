package com.luciaamalia.solid.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pedido {

    @Id
    private Long idPedido;
    private Cliente cliente;
    private List<Pagamento> pagamentos;

}
