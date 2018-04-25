package com.example.demo.dao.queue;

import com.example.demo.model.Queue;

import java.util.List;

public interface IQueueDAO {
    Queue save(Queue queue);

    Queue update(Queue queue);

    void deleteById(int id);

    List<Queue> getAll();
}