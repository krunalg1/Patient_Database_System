package com.example.HMS.repository.service;

import java.util.List;

import com.example.HMS.entity.BirthHistory;
import com.example.HMS.entity.Developmentalmilestone;
import com.example.HMS.entity.Familyhistory;
import com.example.HMS.entity.History;
import com.example.HMS.entity.Ictus;

public interface HistoryService {

	List<History> getAllHistories();
	void saveHistory(History history, BirthHistory birthHistory, Developmentalmilestone developmentalmilestone, Ictus ictus, Familyhistory familyhistory);
	History getHistoryById(int id);
	void deleteHistoryById(int id);
	
	
	List<BirthHistory> getAllBirthHistories();
	List<Developmentalmilestone> getAllDevelopmentalmilestones();
	List<Familyhistory> getAllFamilyhistories();
	List<Ictus> getAllIctus();
//	void deleteHistoryById(int id);
	
}
