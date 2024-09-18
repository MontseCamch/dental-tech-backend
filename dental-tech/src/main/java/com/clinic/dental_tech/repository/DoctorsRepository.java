package com.clinic.dental_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.dental_tech.models.Doctors;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Long>{

}
