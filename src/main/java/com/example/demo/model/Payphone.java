package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "payphones")
@EntityListeners(AuditingEntityListener.class)
public class Payphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "phonenumber_id",insertable = false,updatable = false)
    private Phonenumber phonenumber;

    @Column(name = "phonenumber_id")
    private long phonenumber_id;

    public Payphone() {
    }

    public Payphone(Phonenumber phonenumber, long phonenumber_id) {
        this.phonenumber = phonenumber;
        this.phonenumber_id = phonenumber_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Phonenumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Phonenumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getPhonenumber_id() {
        return phonenumber_id;
    }

    public void setPhonenumber_id(long phonenumber_id) {
        this.phonenumber_id = phonenumber_id;
    }
}
