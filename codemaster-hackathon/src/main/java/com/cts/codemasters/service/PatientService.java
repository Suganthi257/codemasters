package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.codemasters.entity.Provider;

@Service
public class PatientService implements IPatientService  
{
	
	public String getPatientById(Integer patientId)
	{
			 
	 String practitioner = "";
	//creating an object of ArrayList
	 HttpHeaders headers = new HttpHeaders();
	 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	//adding providers to the List
	 RestTemplate restTemplate = new RestTemplate();
	
	 HttpEntity requestEntity = new HttpEntity<>(null,headers);
	 
	 String defaultAPIUrl = "https://hapi.fhir.org/baseR4/Patient/";
	 String finalUrl = defaultAPIUrl + patientId;
			 
	 ResponseEntity<String> responseEntity =  restTemplate.exchange(
			 finalUrl, HttpMethod.GET, requestEntity, String.class);
	
	 if(responseEntity.getStatusCode()==HttpStatus.OK) {
		practitioner = responseEntity.getBody().toString();
	}
	
	 return practitioner;
	 }

}
