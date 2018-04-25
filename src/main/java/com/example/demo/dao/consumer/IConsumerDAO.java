package com.example.demo.dao.consumer;

import com.example.demo.model.Consumer;

import java.util.List;

public interface IConsumerDAO {
    Consumer save(Consumer consumer);

    Consumer update(Consumer consumer);

    void deleteById(int id);

    List<Consumer> getAll();
}
