package com.example.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.HMS.entity.BirthHistory;
import com.example.HMS.entity.History;

public interface BirthHistoryRepository extends JpaRepository<BirthHistory, Long> {

}
