package com.example.HMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ictus")
public class Ictus
{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private long id_ictus; 
		public long getId_ictus() {
			return id_ictus;
		}


		public void setId_ictus(long id_ictus) {
			this.id_ictus = id_ictus;
		}


		private String Bilateral_tonic_clonic_seizure;
		private String Behavioral_arrest_vacant_stare;
		private String Automatism;
		private String Speech;
		private String Motor;
		private String jacksonian_marchString;
		private String Autonomic_symptoms;
		private String Others;
		private String Arousal_State;
		private String Comment;
		
		
		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getBilateral_tonic_clonic_seizure() {
			return Bilateral_tonic_clonic_seizure;
		}


		public void setBilateral_tonic_clonic_seizure(String bilateral_tonic_clonic_seizure) {
			Bilateral_tonic_clonic_seizure = bilateral_tonic_clonic_seizure;
		}


		public String getBehavioral_arrest_vacant_stare() {
			return Behavioral_arrest_vacant_stare;
		}


		public void setBehavioral_arrest_vacant_stare(String behavioral_arrest_vacant_stare) {
			Behavioral_arrest_vacant_stare = behavioral_arrest_vacant_stare;
		}


		public String getAutomatism() {
			return Automatism;
		}


		public void setAutomatism(String automatism) {
			Automatism = automatism;
		}


		public String getSpeech() {
			return Speech;
		}


		public void setSpeech(String speech) {
			Speech = speech;
		}


		public String getMotor() {
			return Motor;
		}


		public void setMotor(String motor) {
			Motor = motor;
		}


		public String getJacksonian_marchString() {
			return jacksonian_marchString;
		}


		public void setJacksonian_marchString(String jacksonian_marchString) {
			this.jacksonian_marchString = jacksonian_marchString;
		}


		public String getAutonomic_symptoms() {
			return Autonomic_symptoms;
		}


		public void setAutonomic_symptoms(String autonomic_symptoms) {
			Autonomic_symptoms = autonomic_symptoms;
		}


		public String getOthers() {
			return Others;
		}


		public void setOthers(String others) {
			Others = others;
		}


		public String getArousal_State() {
			return Arousal_State;
		}


		public void setArousal_State(String arousal_State) {
			Arousal_State = arousal_State;
		}


		public String getComment() {
			return Comment;
		}


		public void setComment(String comment) {
			Comment = comment;
		}


		@Override
		public String toString() {
			return "Ictus [id=" + id + ", id_ictus=" + id_ictus + ", Bilateral_tonic_clonic_seizure="
					+ Bilateral_tonic_clonic_seizure + ", Behavioral_arrest_vacant_stare="
					+ Behavioral_arrest_vacant_stare + ", Automatism=" + Automatism + ", Speech=" + Speech + ", Motor="
					+ Motor + ", jacksonian_marchString=" + jacksonian_marchString + ", Autonomic_symptoms="
					+ Autonomic_symptoms + ", Others=" + Others + ", Arousal_State=" + Arousal_State + ", Comment="
					+ Comment + "]";
		}
	
}
