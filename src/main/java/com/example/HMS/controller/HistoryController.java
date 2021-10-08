package com.example.HMS.controller;

import com.example.HMS.entity.History;

import com.example.HMS.entity.patient;
import com.example.HMS.repository.HistoryRepository;
import com.example.HMS.repository.service.HistoryService;
import com.example.HMS.entity.BirthHistory;
import com.example.HMS.entity.Developmentalmilestone;
import com.example.HMS.entity.Familyhistory;
import com.example.HMS.entity.Ictus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;


@Controller
@Transactional
public class HistoryController {


	@Autowired
	private HistoryService historyService;
	
//	@GetMapping("/")
//	public String home()
//	{
//		return "indexhis";
//	}
	
	@GetMapping("/display")
	public String display(Model model)
	{
		model.addAttribute("listHistories", historyService.getAllHistories());
		return "display";
	}
	
	
	  @GetMapping("/displaybirth")
	  public String displaybirth(Model model) {
	  model.addAttribute("listBirthHistories",historyService.getAllBirthHistories());
	  return "displaybirth";
	  }
	  
	  @GetMapping("/displaydevelop")
	  public String displaydevelop(Model model) {
	  model.addAttribute("listDevelopmental",historyService.getAllDevelopmentalmilestones());
	  return "displaydevelop";
	  }
	  
	  @GetMapping("/displayictus")
	  public String displayictus(Model model) {
	  model.addAttribute("listictus",historyService.getAllIctus());
	  return "displayictus";
	  }
	  
	  @GetMapping("/displayfamily")
	  public String displayfamily(Model model) {
	  model.addAttribute("listfamilyhistory",historyService.getAllFamilyhistories());
	  return "displayfamily";
	  }
	 
	
	@GetMapping("/showNewHistoryForm")
	public String showNewHistoryForm(Model model) {
		// create model attribute to bind form data
		History history = new History();
		model.addAttribute("history", history);
		
		BirthHistory birthHistory = new BirthHistory();
		model.addAttribute("birthHistory", birthHistory);
		
		Developmentalmilestone developmentalmilestone = new Developmentalmilestone();
		model.addAttribute("developmentalmilestone", developmentalmilestone);
		
		Ictus ictus = new Ictus();
		model.addAttribute("ictus", ictus);
		
		Familyhistory familyhistory = new Familyhistory();
		model.addAttribute("familyhistory", familyhistory);
		
		return "new_history";
	}
	
	/*
	 * @GetMapping("/showNewHistoryForm") public String
	 * showNewHistoryFormbirth(Model model) { // create model attribute to bind form
	 * data BirthHistory birthHistory = new BirthHistory();
	 * model.addAttribute("birthHistory", birthHistory);
	 * 
	 * Developmentalmilestone developmentalmilestone = new Developmentalmilestone();
	 * model.addAttribute("developmentalmilestone", developmentalmilestone);
	 * 
	 * Ictus ictus = new Ictus(); model.addAttribute("ictus", ictus);
	 * 
	 * Familyhistory familyhistory = new Familyhistory();
	 * model.addAttribute("familyhistory", familyhistory);
	 * 
	 * return "new_history"; }
	 */
	
	@PostMapping("/saveHistory")
	public String saveHistory(@ModelAttribute("history") History history,@ModelAttribute("birthHistory") BirthHistory birthHistory,@ModelAttribute("developmentalmilestone") Developmentalmilestone developmentalmilestone,@ModelAttribute("ictus") Ictus ictus,@ModelAttribute("familyhistory") Familyhistory familyhistory) {
		// save history to database
		historyService.saveHistory(history,birthHistory,developmentalmilestone,ictus,familyhistory);
		return "redirect:/display";
	}
	
	
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {
		
		// get history from the service
		History history = historyService.getHistoryById(id);
		
		// set history as a model attribute to pre-populate the form
		model.addAttribute("history", history);
		return "update_history";
	}
	
	@GetMapping("/deleteHistory/{id}")
	public String deleteHistory(@PathVariable (value = "id") int id) {
		
		// call delete history method 
		
		this.historyService.deleteHistoryById(id);
		return "redirect:/display";
	}
}
