package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "street")
@EntityListeners(AuditingEntityListener.class)
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "[index]")
    private int index;

    @Column(name = "[channels]")
    private int channels;

    @ManyToOne
    @JoinColumn(name = "MTC_id",insertable = false,updatable = false)
    private Mtc mtc;

    @JsonIgnore
    @OneToMany(mappedBy = "street", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    private List<Phonenumber> phonenumbers;

    @ManyToOne
    @JoinColumn(name = "Region_id",insertable = false,updatable = false)
    private Region region;

    @Column(name = "region_id")
    private long region_id;

    @Column(name = "mtc_id")
    private long mtc_id;

    @OneToMany(mappedBy = "street", cascade=CascadeType.REMOVE)
    private List<Queue> queues;

    public Street(String name, Region region, long region_id, long mtc_id, int index, int channels, Mtc mtc) {
        this.name = name;
        this.region = region;
        this.region_id = region_id;
        this.mtc_id = mtc_id;
        this.index = index;
        this.channels = channels;
        this.mtc = mtc;
    }

    public Street() {
    }

    public long getId() {
        return id;
    }

    public Mtc getMtc() {
        return mtc;
    }

    public void setMtc(Mtc mtc) {
        this.mtc = mtc;
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(long region_id) {
        this.region_id = region_id;
    }

    public long getMtc_id() {
        return mtc_id;
    }

    public void setMtc_id(long mtc_id) {
        this.mtc_id = mtc_id;
    }

}
