package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Final_Diagnosis")
public class Diagnosis {
    @Id
    private int id;
    private String seizure_type;
    private String non_epileptic_events;
    private String clinical_localisation;
    private String epilepsy_type;
    private String epilepsy_syndrome;
    private String etiology;
    private String final_diagnosis;
    private String epilepsy_sergery;




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSeizure_type() {
        return seizure_type;
    }
    public void setSeizure_type(String seizure_type) {
        this.seizure_type = seizure_type;
    }
    public String getNon_epileptic_events() {
        return non_epileptic_events;
    }
    public void setNon_epileptic_events(String non_epileptic_events) {
        this.non_epileptic_events = non_epileptic_events;
    }
    public String getClinical_localisation() {
        return clinical_localisation;
    }
    public void setClinical_localisation(String clinical_localisation) {
        this.clinical_localisation = clinical_localisation;
    }
    public String getEpilepsy_type() {
        return epilepsy_type;
    }
    public void setEpilepsy_type(String epilepsy_type) {
        this.epilepsy_type = epilepsy_type;
    }
    public String getEpilepsy_syndrome() {
        return epilepsy_syndrome;
    }
    public void setEpilepsy_syndrome(String epilepsy_syndrome) {
        this.epilepsy_syndrome = epilepsy_syndrome;
    }
    public String getEtiology() {
        return etiology;
    }
    public void setEtiology(String etiology) {
        this.etiology = etiology;
    }
    public String getFinal_diagnosis() {
        return final_diagnosis;
    }
    public void setFinal_diagnosis(String final_diagnosis) {
        this.final_diagnosis = final_diagnosis;
    }
    public String getEpilepsy_sergery() {
        return epilepsy_sergery;
    }
    public void setEpilepsy_sergery(String epilepsy_sergery) {
        this.epilepsy_sergery = epilepsy_sergery;
    }
    @Override
    public String toString() {
        return "Diagnosis [id=" + id + ", seizure_type=" + seizure_type + ", non_epileptic_events="
                + non_epileptic_events + ", clinical_localisation=" + clinical_localisation + ", epilepsy_type="
                + epilepsy_type + ", epilepsy_syndrome=" + epilepsy_syndrome + ", etiology=" + etiology
                + ", final_diagnosis=" + final_diagnosis + ", epilepsy_sergery=" + epilepsy_sergery + "]";
    }



}
