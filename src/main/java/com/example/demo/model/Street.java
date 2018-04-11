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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "Region_id")
    private Region region;

    @Column(name = "index")
    private int index;

    @Column(name = "channels")
    private int channels;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "MTC_id")
    private Mtc mtc;

    @JsonIgnore
    @OneToMany(mappedBy = "street", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Phonenumber> phonenumbers;

    public Street(String name, Region region, int index, int channels, Mtc mtc, List<Phonenumber> phonenumbers) {
        this.name = name;
        this.region = region;
        this.index = index;
        this.channels = channels;
        this.mtc = mtc;
        this.phonenumbers = phonenumbers;
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

    public List<Phonenumber> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(List<Phonenumber> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }
}
