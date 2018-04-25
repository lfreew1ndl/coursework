package com.example.demo.dao.number;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class NumberDAOImpl implements INumberDAO {
    @Autowired
    DataStorageJDBC storage;

    @Override
    public Number save(Number number) {
        try {
            String query = "insert into number (number) values ("+number.getNumber()+")";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Number update(Number number) {
        try {
            String query = "update number set number = " + number.getNumber()+" where id ="+ number.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from number where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Number> getAll() {
        List<Number> list = new ArrayList<>();
        try {
            String query = "select * from number";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Number(
                        resultSet.getInt("id"),
                        resultSet.getInt("number")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
