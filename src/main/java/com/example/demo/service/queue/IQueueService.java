package com.example.demo.service.queue;

import com.example.demo.model.Queue;

import java.util.List;

public interface IQueueService {
    Queue save(Queue queue);

    Queue update(Queue queue);

    void deleteById(int id);

    List<Queue> getAll();
}
