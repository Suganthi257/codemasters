package com.cts.codemasters.entity;
public class MemberEducation 
{
private String PayerId;
private String PayerName;
private String title;
private String description;
private String url;
private String dispType;

//default constructor
public MemberEducation()
{
	
}
//constructor using fields
public MemberEducation(String PayerId,String PayerName, String title, String description, String url,String dispType) 
{
super();
this.PayerId = PayerId;
this.PayerName = PayerName;
this.title = title;
this.description = description;
this.url = url;
this.dispType = dispType;
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
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDispType() {
	return dispType;
}
public void setDispType(String dispType) {
	this.dispType = dispType;
}


}
