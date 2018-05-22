package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "phonenumber")
@EntityListeners(AuditingEntityListener.class)
public class Phonenumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "number", insertable = false, updatable = false)
    private Number number;

    @Column(name = "number")
    private long number_id;

    @JsonIgnore
    @OneToOne(mappedBy = "phonenumber", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private Consumer consumer;

    @Column(name = "housenumber")
    private String houseNumber;

    @Column(name = "apartment")
    private Long apartment;

    @Column(name = "interspace")
    private boolean interspace;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Street_id", insertable = false, updatable = false)
    private Street street;

    @Column(name = "street_id")
    private long street_id;

    @Enumerated(EnumType.STRING)
    @Column(name = "phonetype")
    private PhoneType phoneType;

    public Phonenumber() {
    }

    public Phonenumber(Number number, long number_id, Consumer consumer, String houseNumber, Long apartment, boolean interspace, Street street, long street_id, PhoneType phoneType) {
        this.number = number;
        this.number_id = number_id;
        this.consumer = consumer;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
        this.interspace = interspace;
        this.street = street;
        this.street_id = street_id;
        this.phoneType = phoneType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public long getNumber_id() {
        return number_id;
    }

    public void setNumber_id(long number_id) {
        this.number_id = number_id;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Long getApartment() {
        return apartment;
    }

    public void setApartment(Long apartment) {
        this.apartment = apartment;
    }

    public boolean isInterspace() {
        return interspace;
    }

    public void setInterspace(boolean interspace) {
        this.interspace = interspace;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public long getStreet_id() {
        return street_id;
    }

    public void setStreet_id(long street_id) {
        this.street_id = street_id;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }
}
