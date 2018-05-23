package com.example.demo.service.consumer;

import com.example.demo.model.ATCType;
import com.example.demo.model.Consumer;

import java.util.List;

public interface IConsumerService {
    Consumer save(Consumer consumer);

    Consumer update(Consumer consumer);

    void deleteById(long id);

    List<Consumer> getAll();

    List<Consumer> getConsumersByPhonenumberStreetMtc_Id(long mtc_id);

    int countConsumersByPhonenumberStreetMtc_Id( long mtc_id);

    int countConsumersByBeneficiaryIsTrue();

    int countConsumersByAgeIsBetween( long firstAge, long lastAge);

    List<Consumer> getConsumersByBalanceLessThan0();

    int countConsumersByBalanceLessThan0();

    List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(long id);

    int countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(long id);

    List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(long id);

    int countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(long id);

    List<Consumer> getConsumersByBalanceLessThan0OrderByBalance();

    int countConsumers();

    List<Consumer> getConsumersByPhonenumberStreetMtcAtcType(ATCType type);

    List<Consumer> getConsumersByPhonenumberPhoneType();

    List<Consumer> getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue();

    List<Consumer> getConsumerByPhonenumberNumber( long number);
}
