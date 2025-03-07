package com.luciaamalia.solid.controller;

import com.luciaamalia.solid.dto.PagamentoRequestDTO;
import com.luciaamalia.solid.dto.PagamentoResponseDTO;
import com.luciaamalia.solid.model.Pagamento;
import com.luciaamalia.solid.service.pagamento.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    public ResponseEntity<PagamentoResponseDTO> processarPagamento(@RequestBody PagamentoRequestDTO requestDTO) {
        PagamentoResponseDTO responseDTO = pagamentoService.processarPagamento(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
