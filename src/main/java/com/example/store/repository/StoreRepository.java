package com.example.store.repository;

import com.example.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findAllByOwnerNameStartsWith(String owner);
}
