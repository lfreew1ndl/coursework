package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "calls")
@EntityListeners(AuditingEntityListener.class)
public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "whoCallNumber")
    private long whoCallNumber;

    @Column(name = "toWhomCallNumber")
    private long toWhomCallNumber;

    @Column(name = "data")
    private java.sql.Date data;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cityCodeWhoCall")
    private City cityWhoCall;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cityCodeToWhomCall")
    private City cityToWhomCall;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWhoCallNumber() {
        return whoCallNumber;
    }

    public void setWhoCallNumber(long whoCallNumber) {
        this.whoCallNumber = whoCallNumber;
    }

    public long getToWhomCallNumber() {
        return toWhomCallNumber;
    }

    public void setToWhomCallNumber(long toWhomCallNumber) {
        this.toWhomCallNumber = toWhomCallNumber;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public City getCityWhoCall() {
        return cityWhoCall;
    }

    public void setCityWhoCall(City cityWhoCall) {
        this.cityWhoCall = cityWhoCall;
    }

    public City getCityToWhomCall() {
        return cityToWhomCall;
    }

    public void setCityToWhomCall(City cityToWhomCall) {
        this.cityToWhomCall = cityToWhomCall;
    }

    public Calls() {

    }

    public Calls(long whoCallNumber, long toWhomCallNumber, Date data, City cityWhoCall, City cityToWhomCall) {
        this.whoCallNumber = whoCallNumber;
        this.toWhomCallNumber = toWhomCallNumber;
        this.data = data;
        this.cityWhoCall = cityWhoCall;

        this.cityToWhomCall = cityToWhomCall;
    }
}
