package com.example.demo.dao.payphone;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.PayPhone;
import com.example.demo.model.Phonenumber;
import com.example.demo.service.phonenumber.IPhonenumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PayPhoneDAOImpl implements IPayPhoneDAO{
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    IPhonenumberService phonenumberService;

    @Override
    public PayPhone save(PayPhone payPhone) {
        try {
            String query = "insert into payphones (PhoneNumber_id) values ("+payPhone.getPhonenumber_id()+")";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PayPhone update(PayPhone payPhone) {
        try {
            String query = "update payphones set PhoneNumber_id="+payPhone.getPhonenumber_id()+" where id ="+ payPhone.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from payphones where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PayPhone> getAll() {
        List<PayPhone> list = new ArrayList<>();
        try {
            String query = "select * from payphones";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new PayPhone(
                        resultSet.getInt("id"),
                        resultSet.getInt("PhoneNumber_id")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Phonenumber> phonenumberList = phonenumberService.getAll();

        for (PayPhone payPhone : list) {
            payPhone.setPhonenumber(phonenumberList.stream().filter(e->e.getId()==payPhone.getPhonenumber_id()).findFirst().orElse(null));
        }

        return list;
    }
}

