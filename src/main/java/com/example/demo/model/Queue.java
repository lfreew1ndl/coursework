package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "queue")
@EntityListeners(AuditingEntityListener.class)
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private long age;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "Street_id")
    private Street street;

    @Column(name = "housenumber")
    private String houseNumber;

    @Column(name = "apartment")
    private String apartment;

    @Column(name = "beneficiary")
    private long beneficiary;

    public Queue(String firstName, String lastName, String sex, long age, Street street, String houseNumber, String apartment, long beneficiary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
        this.beneficiary = beneficiary;
    }

    public Queue() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public long getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(long beneficiary) {
        this.beneficiary = beneficiary;
    }
}
