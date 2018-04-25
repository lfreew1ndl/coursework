package com.example.demo.service.payPhone;


import com.example.demo.dao.payphone.IPayPhoneDAO;
import com.example.demo.model.PayPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayPhoneServiceImpl implements IPayPhoneService {
    @Autowired
    IPayPhoneDAO dao;

    @Override
    public PayPhone save(PayPhone payPhone) {
        return dao.save(payPhone);
    }

    @Override
    public PayPhone update(PayPhone payPhone) {
        return dao.update(payPhone);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<PayPhone> getAll() {
        return dao.getAll();
    }
}
