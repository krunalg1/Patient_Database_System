package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "birthhistory")
public class BirthHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long id_birth; 
	private String Consanguinity;
	private String Preterm_full_term;
	private String Hospital_delivery_Home_delivery;
	private String NVD_Normal_vaginal_delivery_LSCS;
    private String Low_birth_weight;       
    private String Birth_asphyxia_hypoxia;
    private String NICU_stay;
    private String Breastfeeding;
    private String Duration_of_breastfeeding;
    
public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
		public long getId_birth() {
		return id_birth;
	}
	public void setId_birth(long id_birth) {
		this.id_birth = id_birth;
	}
	public String getConsanguinity() {
		return Consanguinity;
	}
	public void setConsanguinity(String consanguinity) {
		Consanguinity = consanguinity;
	}
	public String getPreterm_full_term() {
		return Preterm_full_term;
	}
	public void setPreterm_full_term(String preterm_full_term) {
		Preterm_full_term = preterm_full_term;
	}
	public String getHospital_delivery_Home_delivery() {
		return Hospital_delivery_Home_delivery;
	}
	public void setHospital_delivery_Home_delivery(String hospital_delivery_Home_delivery) {
		Hospital_delivery_Home_delivery = hospital_delivery_Home_delivery;
	}
	public String getNVD_Normal_vaginal_delivery_LSCS() {
		return NVD_Normal_vaginal_delivery_LSCS;
	}
	public void setNVD_Normal_vaginal_delivery_LSCS(String nVD_Normal_vaginal_delivery_LSCS) {
		NVD_Normal_vaginal_delivery_LSCS = nVD_Normal_vaginal_delivery_LSCS;
	}
	public String getLow_birth_weight() {
		return Low_birth_weight;
	}
	public void setLow_birth_weight(String low_birth_weight) {
		Low_birth_weight = low_birth_weight;
	}
	public String getBirth_asphyxia_hypoxia() {
		return Birth_asphyxia_hypoxia;
	}
	public void setBirth_asphyxia_hypoxia(String birth_asphyxia_hypoxia) {
		Birth_asphyxia_hypoxia = birth_asphyxia_hypoxia;
	}
	public String getNICU_stay() {
		return NICU_stay;
	}
	public void setNICU_stay(String nICU_stay) {
		NICU_stay = nICU_stay;
	}
	public String getBreastfeeding() {
		return Breastfeeding;
	}
	public void setBreastfeeding(String breastfeeding) {
		Breastfeeding = breastfeeding;
	}
	public String getDuration_of_breastfeeding() {
		return Duration_of_breastfeeding;
	}
	public void setDuration_of_breastfeeding(String duration_of_breastfeeding) {
		Duration_of_breastfeeding = duration_of_breastfeeding;
	}
	
	@Override
	public String toString() {
		return "BirthHistory [id=" + id + ", id_birth=" + id_birth + ", Consanguinity=" + Consanguinity
				+ ", Preterm_full_term=" + Preterm_full_term + ", Hospital_delivery_Home_delivery="
				+ Hospital_delivery_Home_delivery + ", NVD_Normal_vaginal_delivery_LSCS="
				+ NVD_Normal_vaginal_delivery_LSCS + ", Low_birth_weight=" + Low_birth_weight
				+ ", Birth_asphyxia_hypoxia=" + Birth_asphyxia_hypoxia + ", NICU_stay=" + NICU_stay + ", Breastfeeding="
				+ Breastfeeding + ", Duration_of_breastfeeding=" + Duration_of_breastfeeding + "]";
	}
   
}
