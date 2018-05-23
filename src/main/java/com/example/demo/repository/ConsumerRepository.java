package com.example.demo.repository;

import com.example.demo.model.ATCType;
import com.example.demo.model.Consumer;
import com.example.demo.model.PhoneType;
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

    @Query("select count(c) from Consumer c")
    int countConsumers();

    @Query("select count(c) from Consumer c where c.beneficiary = true")
    int countConsumersByBeneficiaryIsTrue();

    @Query("select count(c) from Consumer c where c.age between :firstAge and :lastAge")
    int countConsumersByAgeIsBetween(@Param("firstAge") long firstAge,@Param("lastAge") long lastAge);

    @Query("select c from Consumer c where c.balance < 0")
    List<Consumer> getConsumersByBalanceLessThan0();

    @Query("select count(c) from Consumer c where c.balance < 0")
    int countConsumersByBalanceLessThan0();

    @Query("select c from Consumer c where c.balance < 0 and c.phonenumber.street.mtc_id = :id")
    List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@Param("id") long id);

    @Query("select count(c) from Consumer c where c.balance < 0 and c.phonenumber.street.mtc_id = :id")
    int countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(@Param("id") long id);

    @Query("select c from Consumer c where c.balance < 0 and c.phonenumber.street.region_id = :id")
    List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@Param("id") long id);

    @Query("select count(c) from Consumer c where c.balance < 0 and c.phonenumber.street.region_id = :id")
    int countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(@Param("id") long id);

    @Query("select c from Consumer c where c.balance < 0 order by c.balance")
    List<Consumer> getConsumersByBalanceLessThan0OrderByBalance();

    @Query("select c from Consumer c where c.phonenumber.street.mtc.atcType = :type")
    List<Consumer> getConsumersByPhonenumberStreetMtcAtcType(@Param("type") ATCType type);

    @Query("select c from Consumer c where c.phonenumber.phoneType = 'Паралельний'")
    List<Consumer> getConsumersByPhonenumberPhoneType();

    @Query("select c from Consumer c where c.phonenumber.phoneType = 'Паралельний' and c.beneficiary = true")
    List<Consumer> getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue();

    @Query("select c from Consumer c where c.phonenumber.number.number = :number")
    List<Consumer> getConsumerByPhonenumberNumber(@Param("number") long number);


}
