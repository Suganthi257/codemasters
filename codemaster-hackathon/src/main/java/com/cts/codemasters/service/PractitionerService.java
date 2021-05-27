package com.cts.codemasters.service;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.cts.codemasters.entity.SearchParam;

@Service
public class PractitionerService implements IPractitionerService  
{
@Override
public String getPractitionerByState()
{
	 
String practitioner = "";
//creating an object of ArrayList
HttpHeaders headers = new HttpHeaders();
headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//adding providers to the List
RestTemplate restTemplate = new RestTemplate();

HttpEntity requestEntity = new HttpEntity<>(null,headers);
ResponseEntity<String> responseEntity =  restTemplate.exchange(
        "http://hapi.fhir.org/baseR4/Practitioner?address-state=CT&_pretty=true", HttpMethod.GET, requestEntity, String.class);

if(responseEntity.getStatusCode()==HttpStatus.OK) {
	practitioner = responseEntity.getBody().toString();
}

return practitioner;
}

public String getPractitionersOnSearch(SearchParam searchParam) {

	String practitioner = "";
	// creating an object of ArrayList
	HttpHeaders headers = new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	// adding providers to the List
	RestTemplate restTemplate = new RestTemplate();

	HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
	String defaultUrl = "http://hapi.fhir.org/baseR4/Practitioner?address-state=CT";
	String prettyStmt = "&_pretty=true";

	String finalUrl = "";
	String queries = "";

	if (null != searchParam) {

		if (!StringUtils.isEmpty(searchParam.getName())) {

			queries = queries + "&name=" + searchParam.getName();
		}
		if (!StringUtils.isEmpty(searchParam.getAddress())) {

			queries = queries + "&address=" + searchParam.getAddress();
		}
		if (!StringUtils.isEmpty(searchParam.getAddress_country())) {

			queries = queries + "&address-country=" + searchParam.getAddress_country();
		}
		if (!StringUtils.isEmpty(searchParam.getAddress_postalcode())) {

			queries = queries + "&address-postalcode=" + searchParam.getAddress_postalcode();
		}
	} else {
		queries = "";
	}

	finalUrl = defaultUrl +queries + prettyStmt;
	System.out.println("Final URL"+ finalUrl);

	ResponseEntity responseEntity = restTemplate.exchange(finalUrl, HttpMethod.GET, requestEntity, String.class);

	if (responseEntity.getStatusCode() == HttpStatus.OK) {
		practitioner = responseEntity.getBody().toString();
	}

	return practitioner;
}
}
