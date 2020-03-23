package com.phone.shop.controller;

import com.phone.shop.dto.TransactionDto;
import com.phone.shop.entity.Transaction;
import com.phone.shop.mapper.TransactionMapper;
import com.phone.shop.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    public TransactionController(final TransactionService transactionService, final TransactionMapper transactionMapper) {
        this.transactionService = transactionService;
        this.transactionMapper = transactionMapper;
    }

    @PostMapping("/saveTransaction")
    public ResponseEntity<TransactionDto> saveTransaction(@RequestBody final TransactionDto transaction) {
        final Transaction savedTransaction = transactionService.save(transaction);
        final TransactionDto transactionDto = transactionMapper.transactionToTransactionDto(savedTransaction);
        return ResponseEntity.ok().body(transactionDto);
    }
}
