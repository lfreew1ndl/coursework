package com.example.demo.repository;

import com.example.demo.model.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street,Long> {
}
