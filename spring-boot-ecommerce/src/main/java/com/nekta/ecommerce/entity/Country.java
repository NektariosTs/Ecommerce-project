package com.nekta.ecommerce.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;


import java.util.List;



@Entity
@Table(name = "country")
//@Getter
//@Setter

public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    //One-to-Many
    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<State> states;

    public Country() {}

    public Country(int id, String code, String name, List<State> states) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.states = states;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }
}
