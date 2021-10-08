package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familyhistory")
public class Familyhistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long id_famhis;
	private String Significant;
	private String Febrile;
	private String Epilepsy;
	private String Familial;
	private String Delay;
	private String Disability;
	private String Others;
	
	
	public long getId_famhis() {
		return id_famhis;
	}
	public void setId_famhis(long id_famhis) {
		this.id_famhis = id_famhis;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSignificant() {
		return Significant;
	}
	public void setSignificant(String significant) {
		Significant = significant;
	}
	public String getFebrile() {
		return Febrile;
	}
	public void setFebrile(String febrile) {
		Febrile = febrile;
	}
	public String getEpilepsy() {
		return Epilepsy;
	}
	public void setEpilepsy(String epilepsy) {
		Epilepsy = epilepsy;
	}
	public String getFamilial() {
		return Familial;
	}
	public void setFamilial(String familial) {
		Familial = familial;
	}
	public String getDelay() {
		return Delay;
	}
	public void setDelay(String delay) {
		Delay = delay;
	}
	public String getDisability() {
		return Disability;
	}
	public void setDisability(String disability) {
		Disability = disability;
	}
	public String getOthers() {
		return Others;
	}
	public void setOthers(String others) {
		Others = others;
	}

	@Override
	public String toString() {
		return "Familyhistory [id=" + id + ", id_famhis=" + id_famhis + ", Significant=" + Significant + ", Febrile="
				+ Febrile + ", Epilepsy=" + Epilepsy + ", Familial=" + Familial + ", Delay=" + Delay + ", Disability="
				+ Disability + ", Others=" + Others + "]";
	}
	
	
}
