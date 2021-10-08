package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="referred")
public class Referred {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String referredto;

    public Referred(long id, String referredto) {
        super();
        this.id = id;
        this.referredto = referredto;
    }


    public Referred() {
        // TODO Auto-generated constructor stub
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getReferredto() {
        return referredto;
    }
    public void setReferredto(String referredto) {
        this.referredto = referredto;
    }

}
