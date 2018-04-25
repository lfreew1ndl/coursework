package com.example.demo.service.consumer;

import com.example.demo.model.Consumer;

import java.util.List;

public interface IConsumerService {
    Consumer save(Consumer consumer);

    Consumer update(Consumer consumer);

    void deleteById(int id);

    List<Consumer> getAll();
}
