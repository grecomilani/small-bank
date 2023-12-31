package com.sample.smallbank.repository;

import com.sample.smallbank.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    List<CardEntity> findByCustomer_CustomerId(Long customerId);
}