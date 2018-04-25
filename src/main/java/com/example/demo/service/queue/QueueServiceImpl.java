package com.example.demo.service.queue;

import com.example.demo.dao.queue.IQueueDAO;
import com.example.demo.model.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueServiceImpl implements IQueueService{
    @Autowired
    IQueueDAO dao;

    @Override
    public Queue save(Queue queue) {
        return dao.save(queue);
    }

    @Override
    public Queue update(Queue queue) {
        return dao.update(queue);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Queue> getAll() {
        return dao.getAll();
    }
}
