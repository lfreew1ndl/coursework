package com.example.demo.service.phonenumber;

import com.example.demo.repository.PhonenumberRepository;
import com.example.demo.model.Phonenumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonenumberServiceImpl implements IPhonenumberService{
    @Autowired
    PhonenumberRepository repository;

    @Override
    public Phonenumber save(Phonenumber phonenumber) {
        return repository.save(phonenumber);
    }

    @Override
    public Phonenumber update(Phonenumber phonenumber) {
        return repository.save(phonenumber);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Phonenumber> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Phonenumber> getPhonenumbersByStreet_id(long street_id) {
        return repository.getPhonenumbersByStreet_id(street_id);
    }

    @Override
    public int countPhonenumbersByPhoneTypeIsPayPhone() {
        return repository.countPhonenumbersByPhoneTypeIsPayPhone();
    }
}