package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.codemasters.entity.ThirdPartyAppsList;

@Service
public class ThirdPartyAppsService implements IThirdPartyAppsService  
{
@Override
public List<ThirdPartyAppsList> findAll()
{
	//creating an object of ArrayList
	ArrayList<ThirdPartyAppsList> appsList = new ArrayList<>();
	//adding providers to the List
	appsList.add(new ThirdPartyAppsList("15645367","Aetna","My Data My Health" ,"Naveen Krishnamoorthy","Registered since: Dec-2020"));
	appsList.add(new ThirdPartyAppsList("15645367","Aetna","Virtual Viewer","Snow bound","Registered since: Mar-2017"));
	appsList.add(new ThirdPartyAppsList("15645367","Aetna","hapi.fhir","Apache","Registered since: June-2017"));
	appsList.add(new ThirdPartyAppsList("15645367","Aetna","Code Masters","Prabakaran","Registered since: Dec-2020"));

	return appsList;
	}
}
