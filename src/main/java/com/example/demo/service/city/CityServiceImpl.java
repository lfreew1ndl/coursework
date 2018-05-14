package com.example.demo.service.city;

import com.example.demo.repository.CityRepository;
import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService{
    @Autowired
    CityRepository repository;

    @Override
    public City save(City city) {
        return repository.save(city);
    }

    @Override
    public City update(City city) {
        return repository.save(city);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<City> getAll() {
        return repository.findAll();
    }
}
