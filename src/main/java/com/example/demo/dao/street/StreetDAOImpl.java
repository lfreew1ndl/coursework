package com.example.demo.dao.street;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Mtc;
import com.example.demo.model.Region;
import com.example.demo.model.Street;
import com.example.demo.service.mtc.IMtcService;
import com.example.demo.service.region.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class StreetDAOImpl implements IStreetDAO {
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    IRegionService regionService;

    @Autowired
    IMtcService mtcService;

    @Override
    public Street save(Street street) {
        try {
            String query = "insert into street (name,Region_id,street.index,channels,MTC_id) values ('"+street.getName()+"',"+street.getRegion_id()+","+street.getIndex()+","+street.getChannels()+","+street.getMtc_id()+")";
            System.out.println(query);
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Street update(Street street) {
        try {
            String query = "update street set name = '" + street.getName()+"',Region_id = "+street.getRegion_id()+",street.index="+street.getIndex()+",channels = "+street.getChannels()+",MTC_id="+street.getMtc_id()+" where id ="+ street.getId();
            System.out.println(query);
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from street where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Street> getAll() {
        List<Street> list = new ArrayList<>();
        try {
            String query = "select * from street";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Street(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("Region_id"),
                        resultSet.getInt("index"),
                        resultSet.getInt("channels"),
                        resultSet.getInt("Mtc_id")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Mtc> mtcList = mtcService.getAll();
        List<Region> regionList = regionService.getAll();

        for (Street street : list) {
            street.setRegion(regionList.stream().filter(e->e.getId()==street.getRegion_id()).findFirst().orElse(null));
            street.setMtc(mtcList.stream().filter(e->e.getId()==street.getMtc_id()).findFirst().orElse(null));
        }
        return list;
    }
}
