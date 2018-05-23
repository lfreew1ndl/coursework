package com.example.demo.service.number;

import com.example.demo.model.Number;
import com.example.demo.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements INumberService {
    @Autowired
    NumberRepository repository;

    @Override
    public Number save(Number number) {
        return repository.save(number);
    }

    @Override
    public Number update(Number number) {
        return repository.save(number);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Number> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Number> getNumbersByPhonenumberIsNull() {
        return repository.getNumbersByPhonenumberIsNull();
    }

    @Override
    public int countNumbersByPhonenumberIsNullAAnd() {
        return repository.countNumbersByPhonenumberIsNullAAnd();
    }
}
