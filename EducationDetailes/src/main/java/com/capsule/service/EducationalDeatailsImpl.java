package com.capsule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsule.entity.EducationDetails;
import com.capsule.repo.EducationRepo;

@Service
public class EducationalDeatailsImpl implements EducationalDeatails {

    @Autowired
    private EducationRepo details;

    @Override
    public String saveData(EducationDetails educationDetails) {
        try {
            // Save the provided education details
            details.save(educationDetails);
            return "Record Updated";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to save education details: " + e.getMessage();
        }
    }
        @Override
        public EducationDetails getDetailsById(long id) {
            // Retrieve education details by ID
            return details.findById(id);
        }
    }