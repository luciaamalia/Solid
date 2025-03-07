package com.luciaamalia.solid.service.pagamento;

public class MetodoPagamentoFactory {

    public MetodoPagamento criarMetodoPagamento(String tipo){
        return switch (tipo.toLowerCase()){
            case "cartao" -> new CartaoCreditoPagamento();
            case "pix" -> new PixPagamento();
            default -> throw new IllegalArgumentException("Método de pagamento não suportado");
        };
    }
}
