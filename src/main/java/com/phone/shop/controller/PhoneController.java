package com.phone.shop.controller;

import com.phone.shop.dto.PhoneDto;
import com.phone.shop.dto.PhoneTransactionDto;
import com.phone.shop.service.PhoneService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController(final PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @PostMapping("/updatePhone")
    public ResponseEntity<PhoneDto> updatePhone(@RequestBody final PhoneTransactionDto phone) throws BadHttpRequest {
        if (phone.getId() != null) {
            phoneService.addTransaction(phone);
            return ResponseEntity.ok().build();
        } else {
            throw new BadHttpRequest();
        }
    }

    @GetMapping("/phones")
    public ResponseEntity<List<PhoneDto>> getAllPhones(final Pageable pageable) {
        final List<PhoneDto> phones = phoneService.findAll(pageable);
        return ResponseEntity.ok().header("").body(phones);
    }
}
