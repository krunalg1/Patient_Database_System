package com.example.HMS.repository;

import com.example.HMS.entity.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface diagnosisRepository extends JpaRepository<Diagnosis, Integer> {

}
