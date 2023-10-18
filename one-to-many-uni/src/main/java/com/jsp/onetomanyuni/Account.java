package com.jsp.onetomanyuni;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String bank_name;
   private long accno;
   private String ifsc_code;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public String getIfsc_code() {
	return ifsc_code;
}
public void setIfsc_code(String ifsc_code) {
	this.ifsc_code = ifsc_code;
}
}

