package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "develop")
public class Developmentalmilestone
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 private long id_develop; 
	 
	public long getId_develop() {
		return id_develop;
	}
	public void setId_develop(long id_develop) {
		this.id_develop = id_develop;
	}


	private String Attained_as_per_age;
	private String Gross_Motor;
	private String Fine_motor;
	private String Language;
	private String Social;
	private String Developmental_age;
	private String History_of_neuroregression;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAttained_as_per_age() {
		return Attained_as_per_age;
	}
	public void setAttained_as_per_age(String attained_as_per_age) {
		Attained_as_per_age = attained_as_per_age;
	}
	public String getGross_Motor() {
		return Gross_Motor;
	}
	public void setGross_Motor(String gross_Motor) {
		Gross_Motor = gross_Motor;
	}
	public String getFine_motor() {
		return Fine_motor;
	}
	public void setFine_motor(String fine_motor) {
		Fine_motor = fine_motor;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getSocial() {
		return Social;
	}
	public void setSocial(String social) {
		Social = social;
	}
	public String getDevelopmental_age() {
		return Developmental_age;
	}
	public void setDevelopmental_age(String developmental_age) {
		Developmental_age = developmental_age;
	}
	public String getHistory_of_neuroregression() {
		return History_of_neuroregression;
	}
	public void setHistory_of_neuroregression(String history_of_neuroregression) {
		History_of_neuroregression = history_of_neuroregression;
	}
	
	
	@Override
	public String toString() {
		return "Developmentalmilestone [id=" + id + ", id_develop=" + id_develop + ", Attained_as_per_age="
				+ Attained_as_per_age + ", Gross_Motor=" + Gross_Motor + ", Fine_motor=" + Fine_motor + ", Language="
				+ Language + ", Social=" + Social + ", Developmental_age=" + Developmental_age
				+ ", History_of_neuroregression=" + History_of_neuroregression + "]";
	}
	
	
}
