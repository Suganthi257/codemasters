/**
 * 
 */
package com.cts.codemasters.entity;

/**
 * @author 525523
 *
 */
public class SearchParam {
	
	private String name;
	
	private String address;
	private String address_postalcode;
	private String address_country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_postalcode() {
		return address_postalcode;
	}
	public void setAddress_postalcode(String address_postalcode) {
		this.address_postalcode = address_postalcode;
	}
	public String getAddress_country() {
		return address_country;
	}
	public void setAddress_country(String address_country) {
		this.address_country = address_country;
	}
	
	

}
