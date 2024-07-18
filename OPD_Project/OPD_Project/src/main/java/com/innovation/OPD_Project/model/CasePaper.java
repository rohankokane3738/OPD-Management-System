package com.innovation.OPD_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CasePaper {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long cid;
private long pid,aid;

private String dt,complain,bp,sugar,spo;
public CasePaper() {
	super();
	// TODO Auto-generated constructor stub
}
public CasePaper(long pid, String dt, String complain, String bp, String sugar, String spo ,long aid) {
	super();
	this.pid = pid;
	this.dt = dt;
	this.complain = complain;
	this.bp = bp;
	this.sugar = sugar;
	this.spo = spo;
	this.aid=aid;
}

public long getAid() {
	return aid;
}
public void setAid(long aid) {
	this.aid = aid;
}
public long getCid() {
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public String getDt() {
	return dt;
}
public void setDt(String dt) {
	this.dt = dt;
}
public String getComplain() {
	return complain;
}
public void setComplain(String complain) {
	this.complain = complain;
}
public String getBp() {
	return bp;
}
public void setBp(String bp) {
	this.bp = bp;
}
public String getSugar() {
	return sugar;
}
public void setSugar(String sugar) {
	this.sugar = sugar;
}
public String getSpo() {
	return spo;
}
public void setSpo(String spo) {
	this.spo = spo;
}

}
