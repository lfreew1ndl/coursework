package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "consumer")
@EntityListeners(AuditingEntityListener.class)
public class Consumer {

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

    @Column(name = "balance")
    private long balance;

    @Column(name = "beneficiary")
    private long beneficiary;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "phonenumber_id")
    private Phonenumber phonenumber;

    @Column(name = "connected")
    private long connected;

    public Phonenumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Phonenumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Consumer() {
    }

    public Consumer(String firstName, String lastName, String sex, long age, long balance, long beneficiary, Phonenumber phonenumber, long connected) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.balance = balance;
        this.beneficiary = beneficiary;
        this.phonenumber = phonenumber;
        this.connected = connected;
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


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


    public long getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(long beneficiary) {
        this.beneficiary = beneficiary;
    }


    public long getConnected() {
        return connected;
    }

    public void setConnected(long connected) {
        this.connected = connected;
    }

}
