package com.example.demo.service.phonenumber;


import com.example.demo.model.Phonenumber;


import java.util.List;

public interface IPhonenumberService {
    Phonenumber save(Phonenumber phonenumber);

    Phonenumber update(Phonenumber phonenumber);

    void deleteById(long id);

    List<Phonenumber> getAll();

    List<Phonenumber> getPhonenumbersByStreet_id(long street_id);

    int countPhonenumbersByPhoneTypeIsPayPhone();
}
