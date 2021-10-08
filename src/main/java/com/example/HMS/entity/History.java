package com.example.HMS.entity;

import javax.persistence.*;

@Entity
@Table(name="History")
public class History {

   @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "opd_num")
    private patient pat;

    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Id
    private int id;
    private int id_history;
    private String Birth_History;
    private String developmental_MilestoneString;
    private String Vaccinated_As_Per_Age;
    private String Age_Of_Onset_Of_1st_Seizure ;
    private String Age_Of_Onset_Of_Recurring_Seizures ;
    private String Duration_Of_Illness;
    private String Timing_Of_Events ;
    private String Frequency_Of_Events;
    private String Semiology_Aura;
    private String Semiology_Ictus;
    private String Semiology_Post_Ictal_State;
    private String Semiology_Associated_With;
    private String Localization;
    private String Lateralization;
    private String HO_Myoclonic_Jerks;
    private String HO_Absences ;
    private String Ho_Status_Epilepticus;
    private String HO_Psychosis;
    private String Antecedents;
    private String OtherPast_His_If_Sig;
    private String Family_history;

       public String getHo_Status_Epilepticus() {
        return Ho_Status_Epilepticus;
    }
    public void setHo_Status_Epilepticus(String ho_Status_Epilepticus) {
        Ho_Status_Epilepticus = ho_Status_Epilepticus;
    }

    public History() {
        // TODO Auto-generated constructor stub
    }

    public String getBirth_History() {
        return Birth_History;
    }
    public void setBirth_History(String birth_History) {
        Birth_History = birth_History;
    }
    public String getDevelopmental_MilestoneString() {
        return developmental_MilestoneString;
    }
    public void setDevelopmental_MilestoneString(String developmental_MilestoneString) {
        this.developmental_MilestoneString = developmental_MilestoneString;
    }
    public String getVaccinated_As_Per_Age() {
        return Vaccinated_As_Per_Age;
    }
    public int getId_history() {
		return id_history;
	}
	public void setId_history(int id_history) {
		this.id_history = id_history;
	}
	public void setVaccinated_As_Per_Age(String vaccinated_As_Per_Age) {
        Vaccinated_As_Per_Age = vaccinated_As_Per_Age;
    }
    public String getAge_Of_Onset_Of_1st_Seizure() {
        return Age_Of_Onset_Of_1st_Seizure;
    }
    public void setAge_Of_Onset_Of_1st_Seizure(String age_Of_Onset_Of_1st_Seizure) {
        Age_Of_Onset_Of_1st_Seizure = age_Of_Onset_Of_1st_Seizure;
    }
    public String getAge_Of_Onset_Of_Recurring_Seizures() {
        return Age_Of_Onset_Of_Recurring_Seizures;
    }
    public void setAge_Of_Onset_Of_Recurring_Seizures(String age_Of_Onset_Of_Recurring_Seizures) {
        Age_Of_Onset_Of_Recurring_Seizures = age_Of_Onset_Of_Recurring_Seizures;
    }
    public String getDuration_Of_Illness() {
        return Duration_Of_Illness;
    }
    public void setDuration_Of_Illness(String duration_Of_Illness) {
        Duration_Of_Illness = duration_Of_Illness;
    }
    public String getTiming_Of_Events() {
        return Timing_Of_Events;
    }
    public void setTiming_Of_Events(String timing_Of_Events) {
        Timing_Of_Events = timing_Of_Events;
    }
    public String getFrequency_Of_Events() {
        return Frequency_Of_Events;
    }
    public void setFrequency_Of_Events(String frequency_Of_Events) {
        Frequency_Of_Events = frequency_Of_Events;
    }
    public String getSemiology_Aura() {
        return Semiology_Aura;
    }
    public void setSemiology_Aura(String semiology_Aura) {
        Semiology_Aura = semiology_Aura;
    }
    public String getSemiology_Ictus() {
        return Semiology_Ictus;
    }
    public void setSemiology_Ictus(String semiology_Ictus) {
        Semiology_Ictus = semiology_Ictus;
    }
    public String getSemiology_Post_Ictal_State() {
        return Semiology_Post_Ictal_State;
    }
    public void setSemiology_Post_Ictal_State(String semiology_Post_Ictal_State) {
        Semiology_Post_Ictal_State = semiology_Post_Ictal_State;
    }
    public String getSemiology_Associated_With() {
        return Semiology_Associated_With;
    }
    public void setSemiology_Associated_With(String semiology_Associated_With) {
        Semiology_Associated_With = semiology_Associated_With;
    }
    public String getLocalization() {
        return Localization;
    }
    public void setLocalization(String localization) {
        Localization = localization;
    }
    public String getLateralization() {
        return Lateralization;
    }
    public void setLateralization(String lateralization) {
        Lateralization = lateralization;
    }
    public String getHO_Myoclonic_Jerks() {
        return HO_Myoclonic_Jerks;
    }
    public void setHO_Myoclonic_Jerks(String hO_Myoclonic_Jerks) {
        HO_Myoclonic_Jerks = hO_Myoclonic_Jerks;
    }
    public String getHO_Absences() {
        return HO_Absences;
    }
    public void setHO_Absences(String hO_Absences) {
        HO_Absences = hO_Absences;
    }
    public String getHO_Psychosis() {
        return HO_Psychosis;
    }
    public void setHO_Psychosis(String hO_Psychosis) {
        HO_Psychosis = hO_Psychosis;
    }
    public String getAntecedents() {
        return Antecedents;
    }
    public void setAntecedents(String antecedents) {
        Antecedents = antecedents;
    }

    public String getOtherPast_His_If_Sig() {
        return OtherPast_His_If_Sig;
    }
    public void setOtherPast_His_If_Sig(String otherPast_His_If_Sig) {
        OtherPast_His_If_Sig = otherPast_His_If_Sig;
    }
    public String getFamily_history() {
        return Family_history;
    }
    public void setFamily_history(String family_history) {
        Family_history = family_history;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
	public String toString() {
		return "History [pat=" + pat + ", id=" + id + ", id_history=" + id_history + ", Birth_History=" + Birth_History
				+ ", developmental_MilestoneString=" + developmental_MilestoneString + ", Vaccinated_As_Per_Age="
				+ Vaccinated_As_Per_Age + ", Age_Of_Onset_Of_1st_Seizure=" + Age_Of_Onset_Of_1st_Seizure
				+ ", Age_Of_Onset_Of_Recurring_Seizures=" + Age_Of_Onset_Of_Recurring_Seizures
				+ ", Duration_Of_Illness=" + Duration_Of_Illness + ", Timing_Of_Events=" + Timing_Of_Events
				+ ", Frequency_Of_Events=" + Frequency_Of_Events + ", Semiology_Aura=" + Semiology_Aura
				+ ", Semiology_Ictus=" + Semiology_Ictus + ", Semiology_Post_Ictal_State=" + Semiology_Post_Ictal_State
				+ ", Semiology_Associated_With=" + Semiology_Associated_With + ", Localization=" + Localization
				+ ", Lateralization=" + Lateralization + ", HO_Myoclonic_Jerks=" + HO_Myoclonic_Jerks + ", HO_Absences="
				+ HO_Absences + ", Ho_Status_Epilepticus=" + Ho_Status_Epilepticus + ", HO_Psychosis=" + HO_Psychosis
				+ ", Antecedents=" + Antecedents + ", OtherPast_His_If_Sig=" + OtherPast_His_If_Sig
				+ ", Family_history=" + Family_history + "]";
	}


}


