package com.example.demo.dao.city;

import com.example.demo.model.City;

import java.util.List;

public interface ICityDAO {
    City save(City city);

    City update(City city);

    void deleteById(int id);

    List<City> getAll();
}
