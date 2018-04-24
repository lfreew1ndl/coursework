package com.example.demo.model;


import java.time.LocalDate;

public class Calls {

  private long id;
  private long whoCallNumber;
  private long toWhomCallNumber;
  private LocalDate data;
  private long cityCodeToWhomCall;
  private long cityCodeWhoCall;

  public Calls(long id, long whoCallNumber, long toWhomCallNumber, LocalDate data, long cityCodeToWhomCall, long cityCodeWhoCall) {
    this.id = id;
    this.whoCallNumber = whoCallNumber;
    this.toWhomCallNumber = toWhomCallNumber;
    this.data = data;
    this.cityCodeToWhomCall = cityCodeToWhomCall;
    this.cityCodeWhoCall = cityCodeWhoCall;
  }

  public Calls() {
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

  public long getCityCodeToWhomCall() {
    return cityCodeToWhomCall;
  }

  public void setCityCodeToWhomCall(long cityCodeToWhomCall) {
    this.cityCodeToWhomCall = cityCodeToWhomCall;
  }

  public long getCityCodeWhoCall() {
    return cityCodeWhoCall;
  }

  public void setCityCodeWhoCall(long cityCodeWhoCall) {
    this.cityCodeWhoCall = cityCodeWhoCall;
  }
}
