package com.example.demo.dao.consumer;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Consumer;
import com.example.demo.model.Phonenumber;
import com.example.demo.service.phonenumber.IPhonenumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ConsumerDAOImpl implements IConsumerDAO {
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    IPhonenumberService phonenumberService;

    @Override
    public Consumer save(Consumer consumer) {
        try {
            String query = "insert into consumer (firstName,lastName,sex,age,balance,beneficiary,PhoneNumber_id,connected) values ('"+consumer.getFirstName()+"','"+consumer.getLastName()+"','"+consumer.getSex()+"',"+consumer.getAge()+","+consumer.getBalance()+","+consumer.getBeneficiary()+","+consumer.getPhonenumber_id()+","+consumer.getConnected()+")";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Consumer update(Consumer consumer) {
        try {
            String query = "update consumer set firstName = '" + consumer.getFirstName()+"', lastName = '"+consumer.getLastName()+"',sex='"+consumer.getSex()+"',age="+consumer.getAge()+",balance="+consumer.getBalance()+",beneficiary = "+consumer.getBeneficiary()+",PhoneNumber_id="+consumer.getPhonenumber_id()+",connected="+consumer.getConnected()+" where id ="+ consumer.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from consumer where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Consumer> getAll() {
        List<Consumer> list = new ArrayList<>();
        try {
            String query = "select * from consumer";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Consumer(
                        resultSet.getInt("id"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("sex"),
                        resultSet.getInt("age"),
                        resultSet.getInt("balance"),
                        resultSet.getBoolean("beneficiary"),
                        resultSet.getInt("PhoneNumber_id"),
                        resultSet.getBoolean("connected")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Phonenumber> phonenumberList = phonenumberService.getAll();

        for (Consumer consumer : list) {
            consumer.setPhonenumber(phonenumberList.stream().filter(e->e.getId()==consumer.getPhonenumber_id()).findFirst().orElse(null));
        }

        return list;
    }
}

