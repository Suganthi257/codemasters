package com.cts.codemasters.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.codemasters.entity.ThirdPartyAppsList;
import com.cts.codemasters.service.IThirdPartyAppsService;
@RestController
public class ThirdPartyAppsController 
{
@Autowired
private IThirdPartyAppsService thirdPartyAppsService;
@GetMapping(value = "/thirdPartyApps")
public List<ThirdPartyAppsList> getThirdPartyAppsDetails() 
{
//finds all the providers
List<ThirdPartyAppsList> appsList = thirdPartyAppsService.findAll();
//returns the providers list
return appsList;
}
}
