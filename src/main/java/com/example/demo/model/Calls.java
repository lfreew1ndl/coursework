package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "calls")
@EntityListeners(AuditingEntityListener.class)
public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "whocallnumber")
    private long whoCallNumber;

    @Column(name = "towhomcallnumber")
    private long toWhomCallNumber;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "citycodewhocall")
    private City cityWhoCall;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "citycodetowhomcall")
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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

    public Calls(long whoCallNumber, long toWhomCallNumber, LocalDate data, City cityWhoCall, City cityToWhomCall) {
        this.whoCallNumber = whoCallNumber;
        this.toWhomCallNumber = toWhomCallNumber;
//        this.data = data;
        this.cityWhoCall = cityWhoCall;

        this.cityToWhomCall = cityToWhomCall;
    }
}
