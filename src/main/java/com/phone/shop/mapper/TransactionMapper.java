package com.phone.shop.mapper;

import com.phone.shop.dto.TransactionDto;
import com.phone.shop.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionDto transactionToTransactionDto(final Transaction transaction);

    Transaction transactionDtoToTransaction(final TransactionDto transactionDto);
}
