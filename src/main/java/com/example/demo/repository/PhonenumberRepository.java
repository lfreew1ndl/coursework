package com.example.demo.repository;

import com.example.demo.model.Phonenumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhonenumberRepository extends JpaRepository<Phonenumber,Long> {

    @Query("select p from Phonenumber p where p.street_id = :street_id")
    List<Phonenumber> getPhonenumbersByStreet_id(@Param("street_id")long street_id);

    @Query("select count(p) from Phonenumber p  where p.phoneType = 'Таксофон'")
    int countPhonenumbersByPhoneTypeIsPayPhone();
}
