package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pasthistory")
public class PastHistory {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String Compliance;
    private String Maximum_seizure_free_interval;
    private int Seizure_Duration;
    private String Current_ASM;
    private String ASM_tried;
    private String Adverse_effects_of_ASM;


    public PastHistory() {
        // TODO Auto-generated constructor stub
    }

    public int getSeizure_Duration() {
        return Seizure_Duration;
    }

    public void setSeizure_Duration(int seizure_Duration) {
        Seizure_Duration = seizure_Duration;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCompliance() {
        return Compliance;
    }
    public void setCompliance(String compliance) {
        Compliance = compliance;
    }
    public String getMaximum_seizure_free_interval() {
        return Maximum_seizure_free_interval;
    }
    public void setMaximum_seizure_free_interval(String maximum_seizure_free_interval) {
        Maximum_seizure_free_interval = maximum_seizure_free_interval;
    }

    public String getCurrent_ASM() {
        return Current_ASM;
    }
    public void setCurrent_ASM(String current_ASM) {
        Current_ASM = current_ASM;
    }
    public String getASM_tried() {
        return ASM_tried;
    }
    public void setASM_tried(String aSM_tried) {
        ASM_tried = aSM_tried;
    }
    public String getAdverse_effects_of_ASM() {
        return Adverse_effects_of_ASM;
    }
    public void setAdverse_effects_of_ASM(String adverse_effects_of_ASM) {
        Adverse_effects_of_ASM = adverse_effects_of_ASM;
    }

}

