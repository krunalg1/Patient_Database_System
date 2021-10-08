package com.example.HMS.repository.service;


import com.example.HMS.entity.PastHistory;
import com.example.HMS.repository.PastHistoryrepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PastHistoryserviceImpl implements PastHistoryservice {

    @Autowired
    private PastHistoryrepository historyRepository;

    @Override
    public List<PastHistory> getAllHistory() {
        return historyRepository.findAll();
    }

    @Override
    public void savePastHistory(PastHistory history) {
        this.historyRepository.save(history);
    }

    @Override
    public PastHistory getHistoryById(int id) {
        Optional<PastHistory> optional = historyRepository.findById((long) id);
        PastHistory history = null;
        if (optional.isPresent()) {
            history = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return history;
    }


    @Override
    public void deletePastHistoryById(int id) {
        this.historyRepository.deleteById((long) id);
    }

}