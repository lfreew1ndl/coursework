package com.example.demo.service.phonenumber;


import com.example.demo.model.Phonenumber;


import java.util.List;

public interface IPhonenumberService {
    Phonenumber save(Phonenumber phonenumber);

    Phonenumber update(Phonenumber phonenumber);

    void deleteById(int id);

    List<Phonenumber> getAll();
}
