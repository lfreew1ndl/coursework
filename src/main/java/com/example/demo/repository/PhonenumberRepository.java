package com.example.demo.repository;

import com.example.demo.model.Phonenumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonenumberRepository extends JpaRepository<Phonenumber,Long> {
}
