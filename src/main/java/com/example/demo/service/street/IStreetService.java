package com.example.demo.service.street;

import com.example.demo.model.Street;

import java.util.List;

public interface IStreetService {
    Street save(Street street);

    Street update(Street street);

    void deleteById(long id);

    List<Street> getAll();
}
