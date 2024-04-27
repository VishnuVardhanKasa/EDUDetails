package com.capsule.service;
 
import com.capsule.entity.EducationDetails;
 
public interface EducationalDeatails {
	
    String saveData(EducationDetails eds);

	EducationDetails getDetailsById(long id);
}