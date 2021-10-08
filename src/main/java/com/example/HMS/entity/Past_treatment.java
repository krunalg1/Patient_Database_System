package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Past_treatment")
public class Past_treatment {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String complience;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getComplience() {
        return complience;
    }
    public void setComplience(String complience) {
        this.complience = complience;
    }

}
