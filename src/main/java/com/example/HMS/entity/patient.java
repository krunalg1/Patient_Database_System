package com.example.HMS.entity;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
//import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "patient")
public class patient {



  /* @ManyToOne(targetEntity = History.class, fetch = FetchType.LAZY, optional = false)
   @JoinColumn(referencedColumnName = "id", insertable = false, updatable = false)
   private History history;*/

   @OneToMany(fetch = FetchType.EAGER,mappedBy="pat",cascade = CascadeType.ALL)
   private Set<History> history;

    public Set<History> getHistory() {
        return history;
    }

    public void setHistory(Set<History> history) {
        this.history = history;
    }
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Id
    @Column(name = "opd_num")
    private int opd_num ;

    /*@JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Date")
    private Date date = new Date();*/
    @Column(name="Date",nullable=false)
   // @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy",timezone="UTC")
    /*@DateTimeFormat(pattern = "dd-MM-yyyy")*/
    private String Date;


    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "age")
    private int age ;


    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address ;

    @Column(name = "handedness")
    private String	handedness ;

    @Column(name = "family_histofhand")
    private String family_histofhand ;
    @Column(name = "weight")
    private int weight ;


    @Column(name = "education")
    private String	education ;

    @Column(name = "marital_status")
    private String	marital_status;

    @Column(name = "occupation")
    private String	Occupation ;

    @Column(name = "informant")
    private String Informant ;

    @Column(name = "referred_by")
    private String	Referred_by;

    public int getOpd_num() {
        return opd_num;
    }

    public void setOpd_num(int opd_num) {
        this.opd_num = opd_num;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String getFamily_histofhand() {
        return family_histofhand;
    }

    public void setFamily_histofhand(String family_histofhand) {
        this.family_histofhand = family_histofhand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

  /*  @Override
    public String toString() {
        return "patient{" +
                "opd_num=" + opd_num +
                ", date=" + Date +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", handedness='" + handedness + '\'' +
                ", family_histofhand=" + family_histofhand +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", Occupation='" + Occupation + '\'' +
                ", Informant='" + Informant + '\'' +
                ", Referred_by='" + Referred_by + '\'' +
                '}';*/

   /* @Override
    public String toString() {
        return "patient{" +
                "history=" + history +
                '}';
    }*/

    @Override
    public String toString() {
        return "patient{" +
                "opd_num=" + opd_num +
                ", date=" + Date +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", handedness='" + handedness + '\'' +
                ", family_histofhand='" + family_histofhand + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", Occupation='" + Occupation + '\'' +
                ", Informant='" + Informant + '\'' +
                ", Referred_by='" + Referred_by + '\'' +
                '}';
    }
//    }

    public String getInformant() {
        return Informant;
    }

    public void setInformant(String informant) {
        Informant = informant;
    }

    public String getReferred_by() {
        return Referred_by;
    }

    public void setReferred_by(String referred_by) {
        Referred_by = referred_by;
    }

}
