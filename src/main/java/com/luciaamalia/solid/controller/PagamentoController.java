package com.luciaamalia.solid.controller;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;
import com.luciaamalia.solid.service.pagamento.PagamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public String processarPagamento(@RequestBody PagamentoRequestDTO requestDTO){
        this.pagamentoService = pagamentoService;

    }

}
