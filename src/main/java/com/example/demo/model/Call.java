package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "calls")
@EntityListeners(AuditingEntityListener.class)
public class Call {

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
    @JoinColumn(name = "citycodewhocall",insertable = false,updatable = false)
    private City cityWhoCall;

    @Column(name = "citycodewhocall")
    private long cityCodeWhoCall;

    @Column(name = "citycodetowhomcall")
    private long cityCodeToWhomCall;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "citycodetowhomcall",insertable = false,updatable = false)
    private City cityToWhomCall;


    public Call() {
    }

    public Call(long whoCallNumber, long toWhomCallNumber, LocalDate data, City cityWhoCall, long cityCodeWhoCall, long cityCodeToWhomCall, City cityToWhomCall) {
        this.whoCallNumber = whoCallNumber;
        this.toWhomCallNumber = toWhomCallNumber;
        this.data = data;
        this.cityWhoCall = cityWhoCall;
        this.cityCodeWhoCall = cityCodeWhoCall;
        this.cityCodeToWhomCall = cityCodeToWhomCall;
        this.cityToWhomCall = cityToWhomCall;
    }

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

    public long getCityCodeWhoCall() {
        return cityCodeWhoCall;
    }

    public void setCityCodeWhoCall(long cityCodeWhoCall) {
        this.cityCodeWhoCall = cityCodeWhoCall;
    }

    public long getCityCodeToWhomCall() {
        return cityCodeToWhomCall;
    }

    public void setCityCodeToWhomCall(long cityCodeToWhomCall) {
        this.cityCodeToWhomCall = cityCodeToWhomCall;
    }

    public City getCityToWhomCall() {
        return cityToWhomCall;
    }

    public void setCityToWhomCall(City cityToWhomCall) {
        this.cityToWhomCall = cityToWhomCall;
    }
}
