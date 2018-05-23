package com.example.demo.service.number;

import com.example.demo.model.Number;

import java.util.List;

public interface INumberService {
    Number save(Number number);

    Number update(Number number);

    void deleteById(long id);

    List<Number> getAll();

    List<Number> getNumbersByPhonenumberIsNull();

    int countNumbersByPhonenumberIsNullAAnd();
}
