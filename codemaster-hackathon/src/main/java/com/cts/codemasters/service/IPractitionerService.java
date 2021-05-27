package com.cts.codemasters.service;
import com.cts.codemasters.entity.SearchParam;

public interface IPractitionerService 
{
	
String getPractitionerByState();
String getPractitionersOnSearch(SearchParam searchParam);

}
