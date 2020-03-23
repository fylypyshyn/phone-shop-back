package com.phone.shop.service.impl;

import com.phone.shop.dto.PhoneDto;
import com.phone.shop.dto.PhoneTransactionDto;
import com.phone.shop.entity.Phone;
import com.phone.shop.entity.Transaction;
import com.phone.shop.mapper.PhoneMapper;
import com.phone.shop.mapper.TransactionMapper;
import com.phone.shop.repository.PhoneRepository;
import com.phone.shop.service.PhoneService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;
    private final TransactionMapper transactionMapper;
    private final PhoneMapper phoneMapper;

    public PhoneServiceImpl(final PhoneRepository phoneRepository, final TransactionMapper transactionMapper,
                            final PhoneMapper phoneMapper) {
        this.phoneRepository = phoneRepository;
        this.transactionMapper = transactionMapper;
        this.phoneMapper = phoneMapper;
    }

    @Override
    public List<PhoneDto> findAll(final Pageable pageable) {
        Page<Phone> phones = phoneRepository.findAll(pageable);
        return phoneMapper.phonesToPhoneDtos(phones.getContent());
    }

    @Override
    public void addTransaction(final PhoneTransactionDto phoneTransactionDto) {
        final String phoneId = phoneTransactionDto.getId();
        phoneRepository.findById(phoneId)
                .map(phone -> {
                    final Transaction transaction = transactionMapper.transactionDtoToTransaction(phoneTransactionDto.getTransaction());
                    phone.getTransactions().add(transaction);
                    return phoneRepository.save(phone);
                });
    }
}
