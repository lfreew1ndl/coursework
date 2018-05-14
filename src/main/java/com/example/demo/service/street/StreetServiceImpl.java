package com.example.demo.service.street;

import com.example.demo.repository.StreetRepository;
import com.example.demo.model.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements IStreetService{
    @Autowired
    StreetRepository repository;

    @Override
    public Street save(Street street) {
        return repository.save(street);
    }

    @Override
    public Street update(Street street) {
        return repository.save(street);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Street> getAll() {
        return repository.findAll();
    }
}
