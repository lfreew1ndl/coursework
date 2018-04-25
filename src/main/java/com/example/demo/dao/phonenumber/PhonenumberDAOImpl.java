package com.example.demo.dao.phonenumber;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Number;
import com.example.demo.model.PhoneType;
import com.example.demo.model.Phonenumber;
import com.example.demo.model.Street;
import com.example.demo.service.number.INumberService;
import com.example.demo.service.street.IStreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PhonenumberDAOImpl implements IPhonenumberDAO {
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    IStreetService streetService;

    @Autowired
    INumberService numberService;

    @Override
    public Phonenumber save(Phonenumber phonenumber) {
        try {
            String query = "insert into phonenumber (number,houseNumber,apartment,interspace,Street_id,PhoneType) values ("+phonenumber.getNumber_id()+",'"+phonenumber.getHouseNumber()+"',"+phonenumber.getApartment()+","+phonenumber.getInterspace()+","+phonenumber.getStreet_id()+",'"+phonenumber.getPhoneType()+"')";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Phonenumber update(Phonenumber phonenumber) {
        try {
            String query = "update phonenumber set number = " + phonenumber.getNumber_id()+",houseNumber='"+phonenumber.getHouseNumber()+"',apartment="+phonenumber.getApartment()+",interspace="+phonenumber.getInterspace()+",Street_id="+phonenumber.getStreet_id()+" where id ="+ phonenumber.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from phonenumber where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Phonenumber> getAll() {
        List<Phonenumber> list = new ArrayList<>();
        try {
            String query = "select * from phonenumber";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Phonenumber(
                        resultSet.getInt("id"),
                        resultSet.getInt("number"),
                        resultSet.getString("houseNumber"),
                        resultSet.getLong("apartment"),
                        resultSet.getBoolean("interspace"),
                        resultSet.getInt("Street_id"),
                        PhoneType.valueOf(resultSet.getString("PhoneType"))
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Street> streetList = streetService.getAll();
        List<Number> numberList = numberService.getAll();

        for (Phonenumber phonenumber : list) {
            phonenumber.setStreet(streetList.stream().filter(e->e.getId()==phonenumber.getStreet_id()).findFirst().orElse(null));
            phonenumber.setNumber(numberList.stream().filter(e->e.getId()==phonenumber.getNumber_id()).findFirst().orElse(null));
        }

        return list;
    }
}
