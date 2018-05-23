package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "number")
@EntityListeners(AuditingEntityListener.class)
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "number")
    private long number;

    @JsonIgnore
    @OneToOne(mappedBy = "number")
    private Phonenumber phonenumber;


    public Number(long number) {
        this.number = number;
    }

    public Number() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

}
