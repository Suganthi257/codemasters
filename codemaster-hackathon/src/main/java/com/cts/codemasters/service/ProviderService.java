package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.cts.codemasters.entity.Provider;

@Service
public class ProviderService implements IProviderService  
{
@Override
public List<Provider> findAll()
{
//creating an object of ArrayList
ArrayList<Provider> providers = new ArrayList<Provider>();
//adding providers to the List
providers.add(new Provider(745671234, "ERIC ROBERTO BATRES MEDICAL", "Specialists / Family Medicine","5101 FLORENCE AVE BELL", "CA", 90201));
providers.add(new Provider(273647474, "SHOKES LESLIE", "Specialists / Orthopaedic Surgery","5101 FLORENCE AVE BELL", "CA", 90201));
providers.add(new Provider(123456789, "PRIETO JOSE N", "Specialists / General Practice","4566 FLORENCE AVE BELL", "CA", 90201));
providers.add(new Provider(234567891, "GHASSAN M AL-JAZAYRLY", "Specialists / Hematology & Oncology","6513 ATLANTIC AVE BELL", "CA", 90201));
providers.add(new Provider(456790321, "BELLA VIDA HOSPICE", "Facilities / Hospice Care-Community Based","5900 S EASTERN AVE COMMERCE", "CA", 90040));
//returns a list of providers
return providers;
}
}
