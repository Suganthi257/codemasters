package com.cts.codemasters.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.codemasters.entity.SearchParam;
import com.cts.codemasters.service.IPractitionerService;
@RestController
public class PractitionerController 
{
@Autowired
private IPractitionerService practitionerService;
//mapping the getProvider() method to /provider
@GetMapping(value = "/Practitioner")
public String getPractitioner() 
{
	
	return practitionerService.getPractitionerByState();
}

@RequestMapping(method = RequestMethod.POST, value="/Practitioner/searchparam")
@ResponseBody
public String getPractitionerOnSearch(@RequestBody SearchParam searchparam) 
{
	System.out.println("I'm inside the post call");
	System.out.println("query"+searchparam.getName());
	System.out.println("query"+searchparam.getAddress_postalcode());
	System.out.println("query"+searchparam.getAddress_country());
	return practitionerService.getPractitionersOnSearch(searchparam);
}

}
