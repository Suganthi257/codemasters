package com.cts.codemasters.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.codemasters.entity.Provider;
import com.cts.codemasters.service.IProviderService;
@RestController
public class ProviderController 
{
@Autowired
private IProviderService providerService;
//mapping the getProvider() method to /provider
@GetMapping(value = "/provider")
public List<Provider> getProvider() 
{
//finds all the providers
List<Provider> providers = providerService.findAll();
//returns the providers list
return providers;
}
}
