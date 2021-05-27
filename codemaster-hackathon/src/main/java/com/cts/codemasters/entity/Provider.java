package com.cts.codemasters.entity;
public class Provider 
{
private int providerid;
private String providername;
private String speciality;
private String address;
private String state;
private int zipcode;
//default constructor
public Provider()
{
	
}
//constructor using fields
public Provider(int providerid, String providername, String speciality, String address, String state,int zipcode) 
{
super();
this.providerid = providerid;
this.providername = providername;
this.speciality = speciality;
this.address = address;
this.state = state;
this.zipcode = zipcode;
}
public int getProviderid() {
	return providerid;
}
public void setProviderid(int providerid) {
	this.providerid = providerid;
}
public String getProvidername() {
	return providername;
}
public void setProvidername(String providername) {
	this.providername = providername;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}


}
