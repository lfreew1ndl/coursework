package com.example.demo.dao.city;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CityDAOImpl implements ICityDAO {
    @Autowired
    DataStorageJDBC storage;

    @Override
    public City save(City city) {
        try {
            String query = "insert into city (id,name) values ("+city.getId()+",'"+city.getName()+"')";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public City update(City city) {
        try {
            String query = "update city set id="+city.getId()+",name = '" + city.getName()+"' where id ="+ city.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from city where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<City> getAll() {
        List<City> list = new ArrayList<>();
        try {
            String query = "select * from city";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new City(
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}


