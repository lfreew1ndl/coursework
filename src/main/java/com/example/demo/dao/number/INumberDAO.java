package com.example.demo.dao.number;

import com.example.demo.model.Number;

import java.util.List;

public interface INumberDAO {
    Number save(Number number);

    Number update(Number number);

    void deleteById(int id);

    List<Number> getAll();
}
