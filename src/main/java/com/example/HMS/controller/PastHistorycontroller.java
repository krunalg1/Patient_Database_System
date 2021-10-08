package com.example.HMS.controller;

import com.example.HMS.entity.PastHistory;
import com.example.HMS.repository.service.PastHistoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PastHistorycontroller {


    @Autowired
    private PastHistoryservice historyService;

 /*   @RequestMapping("/")
    public String Display() {

        return "index";
    }*/

    @RequestMapping("/History")
    public String viewHomePage(Model model) {

        model.addAttribute("history" ,historyService.getAllHistory());
        return "";
    }

    @RequestMapping("/newPastHistory")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        PastHistory his = new PastHistory();
        model.addAttribute("History", his);
        return "PastHistory";
    }

    @RequestMapping("/showPastHistory")
    public String submitDetails (Model model) {
        model.addAttribute("history", historyService.getAllHistory());
        return "display_PastHistory";
    }

    @RequestMapping("/savePastHistory")
    public String saveEmployee(@ModelAttribute("History") PastHistory his) {
        // save employee to database
        historyService.savePastHistory(his);

        return "redirect:/showPastHistory";
    }

	@RequestMapping("/updateHistory/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {
		PastHistory his = new PastHistory();
		model.addAttribute("emp", his);
		return "update_pasthistory";
	}

    @RequestMapping("/deletePastHistory/{id}")
    public String deleteEmployee(@PathVariable (value = "id") int id) {
        this.historyService.deletePastHistoryById(id);
        return "redirect:/showPastHistory";
    }
}
