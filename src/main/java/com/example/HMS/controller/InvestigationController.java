package com.example.HMS.controller;

import com.example.HMS.entity.Investigation;

import com.example.HMS.entity.patient;
import com.example.HMS.repository.InvestigationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;


@Controller
@Transactional
public class InvestigationController {

    @Autowired
    private InvestigationRepository investigationRepository;

    @GetMapping("/displayinvestigation")
    public String display(Model model)
    {
        model.addAttribute("listinvestigation", investigationRepository.findAll());
        return "display_investigation";
    }


    @GetMapping("/showNewinvestigationForm")
    public String showNewinvestigationForm(Model model)
    {

        Investigation investigation = new Investigation();
        model.addAttribute("investigation", investigation);
        return "new_investigation";
    }


    @PostMapping("/saveInvestigation")
    public String saveInvestigation(@ModelAttribute("investigation") Investigation investigation)
    {
        investigationRepository.save(investigation);
        return "redirect:/displayinvestigation";
    }

    @PostMapping("/updateinvestigation")
    public String updateinvestigation(@ModelAttribute("investigation") Investigation investigation) {
        Investigation invest = investigationRepository.findByinvestigationid(investigation.getInvestigationid());

        invest.setInvestigationto(investigation.getInvestigationto());
       /* invest.setInvestigationid(investigation.getInvestigationid());*/

        investigationRepository.save(invest);

        return "redirect:/displayinvestigation";
    }


    @GetMapping("/FormForUpdateinvestigation/{investigationid}")
    public String Updateinvestiagtion(@PathVariable ( value = "investigationid") long investigationid, Model model) {

        Investigation investigation = investigationRepository.findByinvestigationid(investigationid);


        model.addAttribute("investigation", investigation);
        return "update_investigation";
    }

    @GetMapping("/deleteInvestigation/{investigationid}")
    public String deleteByinvestigationid(@PathVariable (value = "investigationid") long investigationid)
    {

        this.investigationRepository.deleteByinvestigationid(investigationid);
        return "redirect:/displayinvestigation"; }

}
