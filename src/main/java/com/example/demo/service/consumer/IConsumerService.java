package com.example.demo.service.consumer;

import com.example.demo.model.Consumer;

import java.util.List;

public interface IConsumerService {
    Consumer save(Consumer consumer);

    Consumer update(Consumer consumer);

    void deleteById(long id);

    List<Consumer> getAll();

    List<Consumer> getConsumersByPhonenumberStreetMtc_Id(long mtc_id);
}
