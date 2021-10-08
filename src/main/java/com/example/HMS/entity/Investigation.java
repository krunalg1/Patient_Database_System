package com.example.HMS.entity;


import javax.persistence.*;

@Entity
@Table(name ="investigation")
public class Investigation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long investigationid;
    private String investigationto;


    public Investigation(long investigationid, String investigationto) {
        this.investigationid = investigationid;
        this.investigationto = investigationto;
    }

    public Investigation() {

    }

    public long getInvestigationid() {
        return investigationid;
    }

    public void setInvestigationid(long investigationid) {
        this.investigationid = investigationid;
    }

    public String getInvestigationto() {
        return investigationto;
    }

    public void setInvestigationto(String investigationto) {
        this.investigationto = investigationto;
    }
}
