package com.example.HMS.controller;

import com.example.HMS.entity.Investigation;

import com.example.HMS.entity.Referred;
import com.example.HMS.entity.patient;
import com.example.HMS.repository.InvestigationRepository;

import com.example.HMS.repository.ReferredRepository;
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
public class ReferredController {

    @Autowired
    private ReferredRepository referredRepository;

    @GetMapping("/displayreferred")
    public String display(Model model)
    {
        model.addAttribute("listreferred", referredRepository.findAll());
        return "display_referred";
    }


    @GetMapping("/showNewreferredForm")
    public String showNewreferredForm(Model model)
    {

        Referred referred = new Referred();
        model.addAttribute("referred", referred);
        return "new_referred";
    }


    @PostMapping("/saveReferred")
    public String saveReferred(@ModelAttribute("referred") Referred referred)
    {
        referredRepository.save(referred);
        return "redirect:/displayreferred";
    }

    @PostMapping("/updatereferred")
    public String updatereferred(@ModelAttribute("referred") Referred referred) {
        Referred refer = referredRepository.findByreferredid(referred.getId());

        refer.setReferredto(referred.getReferredto());
        referredRepository.save(refer);

        return "redirect:/displayreferred";
    }

    @GetMapping("/FormForUpdatereferred/{id}")
    public String FormForUpdatereferred(@PathVariable ( value = "id") long id, Model model) {

        Referred refer = referredRepository.findByreferredid(id);

        model.addAttribute("referred", refer);
        return "update_referred";
    }

    @GetMapping("/deletereferred/{id}")
    public String deletereferred(@PathVariable (value = "id") long id)
    {

        this.referredRepository.deleteByreferredid(id);
        return "redirect:/displayreferred"; }

}
