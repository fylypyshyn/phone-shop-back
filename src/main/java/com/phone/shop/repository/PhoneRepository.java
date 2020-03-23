package com.phone.shop.repository;

import com.phone.shop.entity.Phone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneRepository extends MongoRepository<Phone, String> {

    Optional<Phone> findById(final String id);

}
