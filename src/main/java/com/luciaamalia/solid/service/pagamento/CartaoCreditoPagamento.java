package com.luciaamalia.solid.service.pagamento;

public class CartaoCreditoPagamento implements MetodoPagamento {

    @Override
    public String pagar(double valor) {
        return "Pagamento de "+ valor + "via Cartão de Crédito processado";
    }
}
