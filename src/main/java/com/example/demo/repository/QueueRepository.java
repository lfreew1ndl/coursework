package com.example.demo.repository;

import com.example.demo.model.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueueRepository extends JpaRepository<Queue,Long> {
}
