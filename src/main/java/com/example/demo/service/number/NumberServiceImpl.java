package com.example.demo.service.number;

import com.example.demo.dao.number.INumberDAO;
import com.example.demo.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements INumberService {
    @Autowired
    INumberDAO dao;

    @Override
    public Number save(Number number) {
        return dao.save(number);
    }

    @Override
    public Number update(Number number) {
        return dao.update(number);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Number> getAll() {
        return dao.getAll();
    }
}
