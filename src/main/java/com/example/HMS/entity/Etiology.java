package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Etiology")
public class Etiology {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int OPD_number;
    private String structural;
    private String infectious;
    private String  immune;
    private String metabolic;
    private String genetic;
    private String unknown;
    private String others;
    public String getStructural() {
        return structural;
    }
    public void setStructural(String structural) {
        this.structural = structural;
    }
    public String getInfectious() {
        return infectious;
    }
    public void setInfectious(String infectious) {
        this.infectious = infectious;
    }
    public String getImmune() {
        return immune;
    }
    public void setImmune(String immune) {
        this.immune = immune;
    }
    public String getMetabolic() {
        return metabolic;
    }
    public void setMetabolic(String metabolic) {
        this.metabolic = metabolic;
    }
    public String getGenetic() {
        return genetic;
    }
    public void setGenetic(String genetic) {
        this.genetic = genetic;
    }
    public String getUnknown() {
        return unknown;
    }
    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }
    public String getOthers() {
        return others;
    }
    public void setOthers(String others) {
        this.others = others;
    }
    public int getOPD_number() {
        return OPD_number;
    }
    public void setOPD_number(int oPD_number) {
        OPD_number = oPD_number;
    }
}
