package com.example.demo.service.city;

import com.example.demo.dao.city.ICityDAO;
import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService{
    @Autowired
    ICityDAO dao;

    @Override
    public City save(City city) {
        return dao.save(city);
    }

    @Override
    public City update(City city) {
        return dao.update(city);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<City> getAll() {
        return dao.getAll();
    }
}
