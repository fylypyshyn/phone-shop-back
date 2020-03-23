package com.phone.shop.service;

import com.phone.shop.dto.TransactionDto;
import com.phone.shop.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    Transaction save(final TransactionDto transactionDto);
}
