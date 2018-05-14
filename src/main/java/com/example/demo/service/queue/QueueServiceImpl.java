package com.example.demo.service.queue;

import com.example.demo.repository.QueueRepository;
import com.example.demo.model.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueServiceImpl implements IQueueService{
    @Autowired
    QueueRepository repository;

    @Override
    public Queue save(Queue queue) {
        return repository.save(queue);
    }

    @Override
    public Queue update(Queue queue) {
        return repository.save(queue);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Queue> getAll() {
        return repository.findAll();
    }
}
