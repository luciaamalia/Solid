package com.luciaamalia.solid.service.pagamento;

public class PixPagamento implements MetodoPagamento{
    @Override
    public String pagar(double valor) {
        return "Pagamento de "+ valor +" via Pix processado";
    }
}
