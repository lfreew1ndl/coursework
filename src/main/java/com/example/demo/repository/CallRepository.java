package com.example.demo.repository;

import com.example.demo.model.Call;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository extends JpaRepository<Call,Long> {
}
