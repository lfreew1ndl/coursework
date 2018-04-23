package com.example.demo.repository;

import com.example.demo.model.Payphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayphoneRepository extends JpaRepository<Payphone,Long> {
}
