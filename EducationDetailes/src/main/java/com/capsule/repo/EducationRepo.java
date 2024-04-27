package com.capsule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capsule.entity.EducationDetails;

@Repository
public interface EducationRepo extends JpaRepository<EducationDetails, Long> {
	EducationDetails findById(long id);
}
