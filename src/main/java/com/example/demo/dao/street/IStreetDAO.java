package com.example.demo.dao.street;

import com.example.demo.model.Street;

import java.util.List;

public interface IStreetDAO {
    Street save(Street street);

    Street update(Street street);

    void deleteById(int id);

    List<Street> getAll();
}
