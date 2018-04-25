package com.example.demo.dao.mtc;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.ATCType;
import com.example.demo.model.Mtc;
import com.example.demo.model.Region;
import com.example.demo.service.mtc.IMtcService;
import com.example.demo.service.mtc.MTCServiceImpl;
import com.example.demo.service.region.IRegionService;
import com.example.demo.service.region.RegionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MtcDAOImpl implements IMtcDAO{

    @Autowired
    DataStorageJDBC storage;
    @Override
    public Mtc save(Mtc mtc) {
        try {
            String query = "insert into mtc (name,ATCType) values ('"+mtc.getName()+"','"+mtc.getAtcType()+"')";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Mtc update(Mtc mtc) {
        try {
            String query = "update mtc set name = '" + mtc.getName()+"', ATCType = '"+mtc.getAtcType()+"' where id ="+ mtc.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from mtc where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Mtc> getAll() {
        List<Mtc> list = new ArrayList<>();
        try {
            String query = "select * from mtc";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Mtc(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        ATCType.valueOf(resultSet.getString("ATCType"))
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
