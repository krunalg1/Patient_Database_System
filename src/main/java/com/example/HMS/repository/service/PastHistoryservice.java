package com.example.HMS.repository.service;

import java.util.List;

import com.example.HMS.entity.PastHistory;


public interface PastHistoryservice {
    List<PastHistory> getAllHistory();
    void savePastHistory(PastHistory history);
    PastHistory getHistoryById(int id);
    void deletePastHistoryById(int id);
//	PastHistory updatePastHistoryById(int id);



}
