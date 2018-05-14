package com.example.demo.service.payphone;

import com.example.demo.model.Payphone;

import java.util.List;

public interface IPayphoneService {
    Payphone save(Payphone payphone);

    Payphone update(Payphone payphone);

    void deleteById(long id);

    List<Payphone> getAll();
}
