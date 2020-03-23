package com.phone.shop.service.impl;

import com.phone.shop.dto.TransactionDto;
import com.phone.shop.entity.Transaction;
import com.phone.shop.mapper.TransactionMapper;
import com.phone.shop.repository.TransactionRepository;
import com.phone.shop.service.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionServiceImpl(final TransactionRepository transactionRepository, final TransactionMapper transactionMapper) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    @Override
    public Transaction save(final TransactionDto transactionDto) {
        final Transaction transaction = transactionMapper.transactionDtoToTransaction(transactionDto);
        return transactionRepository.save(transaction);
    }
}
