package com.example.demo.repository;

import com.example.demo.model.Consumer;
import com.example.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer,Long> {
}
