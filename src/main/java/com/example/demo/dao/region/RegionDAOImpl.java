package com.example.demo.dao.region;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Component
public class RegionDAOImpl implements IRegionDAO {

    @Autowired
    DataStorageJDBC storage;

    @Override
    public Region save(Region region) {
        try {
            String query = "insert into region (name) values ('"+region.getName()+"')";
            int id = storage.executeUpdate(query);
            System.out.println(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Region update(Region region) {
        try {
            System.out.println(region);
            String query = "update region set name = '" + region.getName()+"' where id ="+ region.getId();
            int id = storage.executeUpdate(query);
            System.out.println(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from region where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Region> getAll() {
        List<Region> list = new ArrayList<>();
        try {
            String query = "select * from region";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Region(
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
