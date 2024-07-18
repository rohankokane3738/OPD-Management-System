package com.innovation.OPD_Project.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long prid;
private long aid;
private String medicine,suggestion;
public Prescription() {
	super();
	// TODO Auto-generated constructor stub
}
public Prescription(long aid, String medicine, String suggestion) {
	super();
	this.aid = aid;
	this.medicine = medicine;
	this.suggestion = suggestion;
}
public long getPrid() {
	return prid;
}
public void setPrid(long prid) {
	this.prid = prid;
}
public long getAid() {
	return aid;
}
public void setAid(long aid) {
	this.aid = aid;
}
public String getMedicine() {
	return medicine;
}
public void setMedicine(String medicine) {
	this.medicine = medicine;
}
public String getSuggestion() {
	return suggestion;
}
public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}


}
