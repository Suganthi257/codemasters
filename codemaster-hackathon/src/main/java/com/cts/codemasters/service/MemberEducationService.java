package com.cts.codemasters.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.codemasters.entity.MemberEducation;

@Service
public class MemberEducationService implements IMemberEducationService  
{
@Override
public List<MemberEducation> findAll()
{
//creating an object of ArrayList
ArrayList<MemberEducation> memberEducation = new ArrayList<>();
//adding providers to the List
memberEducation.add(new MemberEducation("15645367","Aetna","Healthcare Interoperability" , "The Interoperability and Patient Access final rule (CMS-9115-F) delivers on the Administration’s promise to put patients first, giving them access to their health information when they need it most and in a way they can best use it", "https://www.cms.gov/newsroom/fact-sheets/transparency-coverage-final-rule-fact-sheet-cms-9915-f","text"));
memberEducation.add(new MemberEducation("15645367","Aetna","What is Interoperability?" , "It is the ability of different information systems, devices and applications (systems) to access, exchange, integrate and cooperatively use data in a coordinated manner, within and across organizational, regional and national boundaries, to provide timely and seamless portability of information and optimize the health of individuals and populations globally", "https://www.himss.org/resources/interoperability-healthcare","text"));
memberEducation.add(new MemberEducation("15645367","Aetna","Aetna - Your Health goals" , "Your health goals lead the way. Wherever they take you, we’ll keep finding new ways to join you – with the latest information and inspiration to support you in your journey", "https://www.aetna.com/health-guide.html","text"));
memberEducation.add(new MemberEducation("15645367","Aetna","General Practitioner" , "Physicians are licensed to diagnose and treat patients' diseases, physiological and psychiatric disorders, injuries and other health-related problems", "https://www.youtube.com/watch?v=vKUAFYVg8fc","video"));

return memberEducation;

	
}
}
