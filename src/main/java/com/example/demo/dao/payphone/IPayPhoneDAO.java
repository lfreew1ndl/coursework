package com.example.demo.dao.payphone;

import com.example.demo.model.PayPhone;

import java.util.List;

public interface IPayPhoneDAO {
    PayPhone save(PayPhone payPhone);

    PayPhone update(PayPhone payPhone);

    void deleteById(int id);

    List<PayPhone> getAll();
}
