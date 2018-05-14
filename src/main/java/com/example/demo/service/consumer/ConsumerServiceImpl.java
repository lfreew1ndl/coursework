package com.example.demo.service.consumer;

import com.example.demo.repository.ConsumerRepository;
import com.example.demo.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    ConsumerRepository repository;

    @Override
    public Consumer save(Consumer consumer) {
        return repository.save(consumer);
    }

    @Override
    public Consumer update(Consumer consumer) {
        return repository.save(consumer);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Consumer> getAll() {
        return repository.findAll();
    }
}
