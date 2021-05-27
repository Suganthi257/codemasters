package com.cts.codemasters.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.codemasters.entity.MemberEducation;
import com.cts.codemasters.service.IMemberEducationService;
@RestController
public class MemberEducationController 
{
@Autowired
private IMemberEducationService memberEducationService;
@GetMapping(value = "/memberEducation")
public List<MemberEducation> getMemberEductaionLinks() 
{
//finds all the providers
List<MemberEducation> memberEducation = memberEducationService.findAll();
//returns the providers list
return memberEducation;
}
}
