package com.example.demo.dao.phonenumber;

import com.example.demo.model.Phonenumber;

import java.util.List;

public interface IPhonenumberDAO {
    Phonenumber save(Phonenumber phonenumber);

    Phonenumber update(Phonenumber phonenumber);

    void deleteById(int id);

    List<Phonenumber> getAll();
}
