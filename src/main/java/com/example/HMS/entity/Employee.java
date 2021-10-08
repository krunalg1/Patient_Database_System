package com.example.HMS.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cdac")
public class Employee {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private long id;

    @Column(name = "Head_circumference")
    private String Head_circumference;

    @Column(name = "Neurocutaneous_markers")
    private String Neurocutaneous_markers;

    @Column(name = "Fundus")
    private String Fundus;


    @Column(name="Other_systemic_examination")
    private String Other_systemic_examination;


    @Column(name="OPD_number")
    private int OPD_number;

    public int getOPD_number() {
        return OPD_number;
    }
    public void setOPD_number(int oPD_number) {
        OPD_number = oPD_number;
    }
    @Column(name="CNS_number")
    private String CNS_number;
    public String getCNS_number() {
        return CNS_number;
    }
    public void setCNS_number(String cNS_number) {
        CNS_number = cNS_number;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getHead_circumference() {
        return Head_circumference;
    }
    public void setHead_circumference(String head_circumference) {
        Head_circumference = head_circumference;
    }
    public String getNeurocutaneous_markers() {
        return Neurocutaneous_markers;
    }
    public void setNeurocutaneous_markers(String neurocutaneous_markers) {
        Neurocutaneous_markers = neurocutaneous_markers;
    }
    public String getFundus() {
        return Fundus;
    }
    public void setFundus(String fundus) {
        Fundus = fundus;
    }
    public String getOther_systemic_examination() {
        return Other_systemic_examination;
    }
    public void setOther_systemic_examination(String other_systemic_examination) {
        Other_systemic_examination = other_systemic_examination;
    }
}

