package com.example.demo.repository;

import com.example.demo.model.Consumer;
import com.example.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsumerRepository extends JpaRepository<Consumer,Long> {
    @Query("select c from Consumer c where c.phonenumber.street.mtc_id = :mtc_id")
    List<Consumer> getConsumersByPhonenumberStreetMtc_Id(@Param("mtc_id") long mtc_id);

    @Query("select count(c) from Consumer c where c.phonenumber.street.mtc_id = :mtc_id")
    int countConsumersByPhonenumberStreetMtc_Id(@Param("mtc_id") long mtc_id);

    @Query("select count(c) from Consumer c where c.beneficiary = true")
    int countConsumersByBeneficiaryIsTrue();

    @Query("select count(c) from Consumer c where c.age between :firstAge and :lastAge")
    int countConsumersByAgeIsBetween(@Param("firstAge") int firstAge,@Param("lastAge") int lastAge);
}
