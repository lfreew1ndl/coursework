package com.example.demo.service.phonenumber;

import com.example.demo.dao.phonenumber.IPhonenumberDAO;
import com.example.demo.model.Phonenumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonenumberServiceImpl implements IPhonenumberService{
    @Autowired
    IPhonenumberDAO dao;

    @Override
    public Phonenumber save(Phonenumber phonenumber) {
        return dao.save(phonenumber);
    }

    @Override
    public Phonenumber update(Phonenumber phonenumber) {
        return dao.update(phonenumber);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Phonenumber> getAll() {
        return dao.getAll();
    }
}