package com.example.store.repository;

import com.example.store.domain.Kategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriesRepository extends JpaRepository<Kategories, Long> {
}
