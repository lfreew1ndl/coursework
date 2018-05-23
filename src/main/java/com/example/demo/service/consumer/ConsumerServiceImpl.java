package com.example.demo.service.consumer;

import com.example.demo.model.ATCType;
import com.example.demo.repository.ConsumerRepository;
import com.example.demo.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    ConsumerRepository repository;

    @Override
    public Consumer save(Consumer consumer) {
        return repository.save(consumer);
    }

    @Override
    public Consumer update(Consumer consumer) {
        return repository.save(consumer);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Consumer> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Consumer> getConsumersByPhonenumberStreetMtc_Id(long mtc_id) {
        return repository.getConsumersByPhonenumberStreetMtc_Id(mtc_id);
    }

    @Override
    public int countConsumersByPhonenumberStreetMtc_Id(long mtc_id) {
        return repository.countConsumersByPhonenumberStreetMtc_Id(mtc_id);
    }

    @Override
    public int countConsumersByBeneficiaryIsTrue() {
        return repository.countConsumersByBeneficiaryIsTrue();
    }

    @Override
    public int countConsumersByAgeIsBetween(long firstAge, long lastAge) {
        return repository.countConsumersByAgeIsBetween(firstAge,lastAge);
    }

    @Override
    public List<Consumer> getConsumersByBalanceLessThan0() {
        return repository.getConsumersByBalanceLessThan0();
    }

    @Override
    public int countConsumersByBalanceLessThan0() {
        return repository.countConsumersByBalanceLessThan0();
    }

    @Override
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(long id) {
        return repository.getConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @Override
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(long id) {
        return repository.countConsumersByBalanceLessThan0AAndPhonenumberStreetMtc_id(id);
    }

    @Override
    public List<Consumer> getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(long id) {
        return repository.getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @Override
    public int countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(long id) {
        return repository.countConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id(id);
    }

    @Override
    public List<Consumer> getConsumersByBalanceLessThan0OrderByBalance() {
        return repository.getConsumersByBalanceLessThan0OrderByBalance();
    }

    @Override
    public int countConsumers() {
        return repository.countConsumers();
    }

    @Override
    public List<Consumer> getConsumersByPhonenumberStreetMtcAtcType(ATCType type) {
        return repository.getConsumersByPhonenumberStreetMtcAtcType(type);
    }

    @Override
    public List<Consumer> getConsumersByPhonenumberPhoneType() {
        return repository.getConsumersByPhonenumberPhoneType();
    }

    @Override
    public List<Consumer> getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue() {
        return repository.getConsumersByPhonenumberPhoneTypeAndBeneficiaryIsTrue();
    }

    @Override
    public List<Consumer> getConsumerByPhonenumberNumber(long number) {
        return repository.getConsumerByPhonenumberNumber(number);
    }
}
