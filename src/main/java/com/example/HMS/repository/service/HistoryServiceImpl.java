package com.example.HMS.repository.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.criteria.internal.BasicPathUsageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HMS.entity.BirthHistory;
import com.example.HMS.entity.Developmentalmilestone;
import com.example.HMS.entity.Familyhistory;
import com.example.HMS.entity.History;
import com.example.HMS.entity.Ictus;
import com.example.HMS.repository.BirthHistoryRepository;
import com.example.HMS.repository.DevelopmentalmilestoneRepository;
import com.example.HMS.repository.FamilyhistoryRepository;
import com.example.HMS.repository.HistoryRepository;
import com.example.HMS.repository.IctusRepository;

@Service
public class HistoryServiceImpl implements HistoryService{

	@Autowired
	private HistoryRepository historyRepository;
	
	@Autowired
	private BirthHistoryRepository birthhistoryRepository;
	
	@Autowired
	private DevelopmentalmilestoneRepository developmentalmilestoneRepository;
	
	@Autowired
	private IctusRepository ictusRepository;
	
	@Autowired
	private FamilyhistoryRepository familyhistoryRepository;
	
	@Override
	public List<History> getAllHistories() {
		
		return historyRepository.findAll();
	}

	@Override
	public void saveHistory(History history , BirthHistory birthHistory, Developmentalmilestone developmentalmilestone, Ictus ictus, Familyhistory familyhistory) {
		this.historyRepository.save(history);
		this.birthhistoryRepository.save(birthHistory);
		this.developmentalmilestoneRepository.save(developmentalmilestone);
		this.ictusRepository.save(ictus);
		this.familyhistoryRepository.save(familyhistory);
	}

	@Override
	public History getHistoryById(int id) {
		Optional<History> optional=historyRepository.findById(id);
		History history=null;
		if(optional.isPresent())
		{
			history=optional.get();
		}else
			{
				throw new RuntimeException("History not Found for id : " +id);
			}
		return history;
		
	}

	
//	@Override
//	public void deleteHistoryById(int id) {
//		this.historyRepository.deleteById(id);
//		
//	}

	@Override
	public List<BirthHistory> getAllBirthHistories() {
		
		return birthhistoryRepository.findAll();
	}

	@Override
	public List<Developmentalmilestone> getAllDevelopmentalmilestones() {
		// TODO Auto-generated method stub
		return developmentalmilestoneRepository.findAll();
	}

	@Override
	public List<Familyhistory> getAllFamilyhistories() {
		// TODO Auto-generated method stub
		return familyhistoryRepository.findAll();
	}

	@Override
	public List<Ictus> getAllIctus() {
		// TODO Auto-generated method stub
		return ictusRepository.findAll();
	}

	@Override
	public void deleteHistoryById(int id) {
		// TODO Auto-generated method stub
		this.historyRepository.deleteById(id);
	}

	

	

}