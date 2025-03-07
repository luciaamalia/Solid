package com.luciaamalia.solid.service.pagamento;

//Strategy para OCP e LSP
public interface MetodoPagamento {
    String pagar(double valor);
}
