package com.cts.codemasters.entity;
public class ThirdPartyAppsList 
{
private String PayerId;
private String PayerName;
private String appsTitle;
private String appOwner;
private String registeredDate;
//default constructor
public ThirdPartyAppsList()
{
	
}
//constructor using fields
public ThirdPartyAppsList(String PayerId, String PayerName,String appsTitle, String appOwner, String registeredDate) 
{
super();
this.PayerId = PayerId;
this.PayerName = PayerName;
this.appsTitle = appsTitle;
this.appOwner = appOwner;
this.registeredDate = registeredDate;
}
public String getPayerId() {
	return PayerId;
}
public void setPayerId(String payerId) {
	PayerId = payerId;
}
public String getPayerName() {
	return PayerName;
}
public void setPayerName(String payerName) {
	PayerName = payerName;
}
public String getAppsTitle() {
	return appsTitle;
}
public void setAppsTitle(String appsTitle) {
	this.appsTitle = appsTitle;
}
public String getAppOwner() {
	return appOwner;
}
public void setAppOwner(String appsDescription) {
	this.appOwner = appsDescription;
}
public String getRegisteredDate() {
	return registeredDate;
}
public void setRegisteredDate(String registeredDate) {
	this.registeredDate = registeredDate;
}

}
