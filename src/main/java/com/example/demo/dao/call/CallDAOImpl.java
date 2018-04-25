package com.example.demo.dao.call;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Call;
import com.example.demo.model.City;
import com.example.demo.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CallDAOImpl implements ICallDAO{
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    ICityService cityService;

    @Override
    public Call save(Call call) {
        try {
            String query = "insert into calls (whoCallNumber,toWhomCallNumber,data,cityCodeWhoCall,cityCodeToWhomCall) values ("+call.getWhoCallNumber()+","+call.getToWhomCallNumber()+",'"+call.getData()+"',"+call.getCityCodeWhoCall()+","+call.getCityCodeToWhomCall()+")";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Call update(Call call) {
        try {
            String query = "update calls set whocallNumber="+call.getWhoCallNumber()+",toWhomCallNumber = " + call.getToWhomCallNumber()+",data='"+call.getData()+"',cityCodeWhoCall="+call.getCityCodeWhoCall()+",cityCodeToWhomCall="+call.getCityCodeToWhomCall()+" where id ="+ call.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from calls where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Call> getAll() {
        List<Call> list = new ArrayList<>();
        try {
            String query = "select * from calls";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Call(
                        resultSet.getInt("id"),
                        resultSet.getInt("whoCallNumber"),
                        resultSet.getInt("toWhomCallNumber"),
                        LocalDate.parse(resultSet.getString("data")),
                        resultSet.getInt("cityCodeWhoCall"),
                        resultSet.getInt("cityCodeToWhomCall")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<City> cityList = cityService.getAll();

        for (Call call : list) {
            call.setCityWhoCall(cityList.stream().filter(e->e.getId()==call.getCityCodeWhoCall()).findFirst().orElse(null));
            call.setCityToWhomCall(cityList.stream().filter(e->e.getId()==call.getCityCodeToWhomCall()).findFirst().orElse(null));
        }

        return list;
    }
}


