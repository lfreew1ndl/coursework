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
    @JoinColumn(name = "number")
    private Number number;

    @JsonIgnore
    @OneToOne(mappedBy = "phonenumber", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, optional = false)
    private Consumer consumer;

    @Column(name = "housenumber")
    private String houseNumber;

    @Column(name = "apartment")
    private Long apartment;

    @Column(name = "interspace")
    private long interspace;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Street_id")
    private Street street;

    @Enumerated(EnumType.STRING)
    @Column(name = "phonetype")
    private PhoneType phoneType;

    public Phonenumber() {
    }

    public Phonenumber(Number number, Consumer consumer, String houseNumber, Long apartment, long interspace, Street street, PhoneType phoneType) {
        this.number = number;
        this.consumer = consumer;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
        this.interspace = interspace;
        this.street = street;
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

    public long getInterspace() {
        return interspace;
    }

    public void setInterspace(long interspace) {
        this.interspace = interspace;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }
}
