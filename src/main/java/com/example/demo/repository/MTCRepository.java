package com.example.demo.repository;

import com.example.demo.model.Calls;
import com.example.demo.model.Mtc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTCRepository extends JpaRepository<Mtc,Long> {
}
