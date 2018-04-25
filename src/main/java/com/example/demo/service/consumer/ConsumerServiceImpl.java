package com.example.demo.service.consumer;

import com.example.demo.dao.consumer.IConsumerDAO;
import com.example.demo.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    IConsumerDAO dao;

    @Override
    public Consumer save(Consumer consumer) {
        return dao.save(consumer);
    }

    @Override
    public Consumer update(Consumer consumer) {
        return dao.update(consumer);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Consumer> getAll() {
        return dao.getAll();
    }
}
