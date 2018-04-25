package com.example.demo.service.number;

import com.example.demo.model.Number;

import java.util.List;

public interface INumberService {
    Number save(Number number);

    Number update(Number number);

    void deleteById(int id);

    List<Number> getAll();
}
