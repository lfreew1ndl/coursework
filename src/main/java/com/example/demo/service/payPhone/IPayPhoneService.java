package com.example.demo.service.payPhone;

import com.example.demo.model.PayPhone;

import java.util.List;

public interface IPayPhoneService {
    PayPhone save(PayPhone payPhone);

    PayPhone update(PayPhone payPhone);

    void deleteById(int id);

    List<PayPhone> getAll();
}
