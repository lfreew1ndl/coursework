package com.example.demo.service.payphone;

import com.example.demo.model.Payphone;
import com.example.demo.repository.PayphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayphoneServiceImpl implements IPayphoneService {
    @Autowired
    PayphoneRepository repository;

    @Override
    public Payphone save(Payphone payphone) {
        return repository.save(payphone);
    }

    @Override
    public Payphone update(Payphone payphone) {
        return repository.save(payphone);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Payphone> getAll() {
        return repository.findAll();
    }
}
