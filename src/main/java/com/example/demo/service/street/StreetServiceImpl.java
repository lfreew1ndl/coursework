package com.example.demo.service.street;

import com.example.demo.dao.street.IStreetDAO;
import com.example.demo.model.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements IStreetService{
    @Autowired
    IStreetDAO dao;

    @Override
    public Street save(Street street) {
        return dao.save(street);
    }

    @Override
    public Street update(Street street) {
        return dao.update(street);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Street> getAll() {
        return dao.getAll();
    }
}
