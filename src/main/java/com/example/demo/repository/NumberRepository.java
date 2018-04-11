package com.example.demo.repository;

import com.example.demo.model.Number;
import com.example.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number,Long> {
}
