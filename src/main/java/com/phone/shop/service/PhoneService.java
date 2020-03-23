package com.phone.shop.service;

import com.phone.shop.dto.PhoneDto;
import com.phone.shop.dto.PhoneTransactionDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneService {

    List<PhoneDto> findAll(final Pageable pageable);

    void addTransaction(final PhoneTransactionDto phoneTransactionDto);
}
