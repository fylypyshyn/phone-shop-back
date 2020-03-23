package com.phone.shop.mapper;

import com.phone.shop.dto.PhoneDto;
import com.phone.shop.entity.Phone;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    PhoneDto phoneToPhoneDto(final Phone phone);

    Phone phoneDtoToPhone(final PhoneDto phoneDto);

    List<Phone> phoneDtosToPhones(final List<PhoneDto> phoneDtos);

    List<PhoneDto> phonesToPhoneDtos(final List<Phone> phone);

}
