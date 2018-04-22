package com.example.demo.model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "region")
@EntityListeners(AuditingEntityListener.class)
public class Region {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;



    @JsonIgnore
    @OneToMany(mappedBy="region", fetch = FetchType.EAGER,  cascade=CascadeType.REMOVE)
    private List<Street> streets;

    public Region(String name, List<Street> streets) {
        this.name = name;
        this.streets = streets;
    }

    public Region() {
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

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
