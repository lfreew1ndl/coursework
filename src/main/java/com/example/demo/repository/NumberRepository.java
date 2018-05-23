package com.example.demo.repository;

import com.example.demo.model.Number;
import com.example.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NumberRepository extends JpaRepository<Number,Long> {

    @Query("select n from Number n left join n.phonenumber p where p.id = null")
    List<Number> getNumbersByPhonenumberIsNull();

    @Query("select count(n) from Number n left join n.phonenumber p where p.id = null")
    int countNumbersByPhonenumberIsNullAAnd();
}
