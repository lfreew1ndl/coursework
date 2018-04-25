package com.example.demo.service.city;

import com.example.demo.model.City;

import java.util.List;

public interface ICityService {
    City save(City city);

    City update(City city);

    void deleteById(int id);

    List<City> getAll();
}
