package com.cts.codemasters.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.cts.codemasters.service.IPatientService;
@RestController
public class PatientController 
{
@Autowired
private IPatientService patientService;
//mapping the getProvider() method to /provider
@GetMapping(value = "/Patient/{id}")
public String getPatient(@PathVariable("id") Integer patientId) 
{
	
	return patientService.getPatientById(patientId);
}

}
