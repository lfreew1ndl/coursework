package com.example.demo.repository;

import com.example.demo.model.Calls;
import com.example.demo.model.Payphones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayphonesRepository extends JpaRepository<Payphones,Long> {
}
