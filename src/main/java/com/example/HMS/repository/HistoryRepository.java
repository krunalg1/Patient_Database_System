package com.example.HMS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HMS.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {

	Optional<History> findById(int id);

	

}

