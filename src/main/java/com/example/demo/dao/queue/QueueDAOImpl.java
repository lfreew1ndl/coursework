package com.example.demo.dao.queue;

import com.example.demo.config.DataStorageJDBC;
import com.example.demo.model.Queue;
import com.example.demo.model.Phonenumber;
import com.example.demo.model.Street;
import com.example.demo.service.phonenumber.IPhonenumberService;
import com.example.demo.service.street.IStreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class QueueDAOImpl implements IQueueDAO {
    @Autowired
    DataStorageJDBC storage;

    @Autowired
    IStreetService streetService;

    @Override
    public Queue save(Queue queue) {
        try {
            String query = "insert into queue (firstName,lastName,sex,age,Street_id,houseNumber,apartment,beneficiary) values ('"+queue.getFirstName()+"','"+queue.getLastName()+"','"+queue.getSex()+"',"+queue.getAge()+","+queue.getStreet_id()+",'"+queue.getHouseNumber()+"','"+queue.getApartment()+"',"+queue.getBeneficiary()+")";
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Queue update(Queue queue) {
        try {
            String query = "update queue set firstName = '" + queue.getFirstName()+"', lastName = '"+queue.getLastName()+"',sex='"+queue.getSex()+"',age="+queue.getAge()+",Street_id="+queue.getStreet_id()+",beneficiary = "+queue.getBeneficiary()+",houseNumber='"+queue.getHouseNumber()+"',apartment='"+queue.getApartment()+"' where id ="+ queue.getId();
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        try {
            String query = "delete from queue where id = "+ id;
            storage.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Queue> getAll() {
        List<Queue> list = new ArrayList<>();
        try {
            String query = "select * from queue";
            ResultSet resultSet = storage.executeQuery(query);
            while (resultSet.next()){
                list.add(new Queue(
                        resultSet.getInt("id"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("sex"),
                        resultSet.getInt("age"),
                        resultSet.getInt("Street_id"),
                        resultSet.getString("houseNumber"),
                        resultSet.getString("apartment"),
                        resultSet.getBoolean("beneficiary")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Street> streetList = streetService.getAll();

        for (Queue queue : list) {
            queue.setStreet(streetList.stream().filter(e->e.getId()==queue.getStreet_id()).findFirst().orElse(null));
        }

        return list;
    }
}

