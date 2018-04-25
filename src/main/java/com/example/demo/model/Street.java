package com.example.demo.model;

public class Street {

  private long id;
  private String name;
  private long region_id;
  private long index;
  private long channels;
  private long mtc_id;
  private Region region;
  private Mtc mtc;

    public Street(long id, String name, long region_id, long index, long channels, long mtc_id) {
        this.id = id;
        this.name = name;
        this.region_id = region_id;
        this.index = index;
        this.channels = channels;
        this.mtc_id = mtc_id;
    }

    public Street() {
    }

    public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getRegion_id() {
    return region_id;
  }

  public void setRegion_id(long region_id) {
    this.region_id = region_id;
  }


  public long getIndex() {
    return index;
  }

  public void setIndex(long index) {
    this.index = index;
  }


  public long getChannels() {
    return channels;
  }

  public void setChannels(long channels) {
    this.channels = channels;
  }


  public long getMtc_id() {
    return mtc_id;
  }

  public void setMtc_id(long mtc_id) {
    this.mtc_id = mtc_id;
  }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Mtc getMtc() {
        return mtc;
    }

    public void setMtc(Mtc mtc) {
        this.mtc = mtc;
    }
}
