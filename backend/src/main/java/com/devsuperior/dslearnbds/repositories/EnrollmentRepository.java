package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.pk.enrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, enrollmentPK> {

}


