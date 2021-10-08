package com.example.HMS.controller;

import com.example.HMS.entity.patient;
import com.example.HMS.repository.patientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class patientcontroller {

    @Autowired
    private patientrepository patients;

    @GetMapping("/")
    public String Mainpage(Model model){
        return "index";
    }
    @GetMapping("/view")
    public String Viewpage(Model model){

        return "Viewpatient";
    }

    @GetMapping("/gettingform")
    public String greetingForm(Model model) {
        patient pat= new patient();
        pat.setAge(23);
        model.addAttribute("patient",pat );
        return "patient";
    }

    @GetMapping("/displaypatientdata")
    public String display(Model model)
    {
        model.addAttribute("patient", patients.findAll());
        return "display_patient";
    }

//    @PostMapping("/patients")
//    public String greetingSubmit(@ModelAttribute patient.html pat, Model model) {
//        model.addAttribute("greeting", pat);
//        return "result";
//    }

//    @GetMapping("/getpatient")
//    public List<patient> getAllUsers() {
//        return patients.findAll();
//    }

//   @RequestMapping(produces = {"application/json", "application/xml"}
//            ,  consumes = {"application/x-www-form-urlencoded"})
    @PostMapping("/savepatient")
    public String createPatient(@ModelAttribute("patient") patient pat) {
        System.out.println("Reach");
        patients.save(pat);
        return "redirect:/displaypatientdata";
    }

    @PostMapping("/updatepatient")
    public String updatePatient(@ModelAttribute("patient") patient pat) {
      patient pati = patients.findByOpd_num(pat.getOpd_num());

      pati.setAge(pat.getAge());
      pati.setAddress(pat.getAddress());
      pati.setDate(pat.getDate());
      pati.setEducation(pat.getEducation());
      pati.setFirstname(pat.getFirstname());
      pati.setGender(pat.getGender());
      pati.setHandedness(pat.getHandedness());
      pati.setFamily_histofhand(pat.getFamily_histofhand());
      pati.setInformant(pat.getInformant());
      pati.setLastname(pat.getLastname());
      pati.setMarital_status(pat.getMarital_status());
      pati.setOccupation(pat.getOccupation());
      pati.setReferred_by(pat.getReferred_by());
      pati.setWeight(pat.getWeight());

      patients.save(pati);
        return "redirect:/displaypatientdata";
    }

    @GetMapping("/getpatient")
    @ResponseBody
    public ModelAndView getpatient(int id ){
       // return patients.findById(id).toString();
        ModelAndView mav= new ModelAndView("Viewpatient");
      //  if(patients.findByOpdNum(id)) {

            mav.addObject("patient", patients.findByOpd_num(id) );
             return mav;

       /* }
        else
         //   return "Sorry! Patient with id "+id+" does not exist";
        return mav;*/

    }
    @GetMapping("/removepatient")
    @ResponseBody
    public String RemoveEmployee(int id) {

        if(patients.existsById(id)) {
            patients.deleteById(id);
            return "successfully Deleted";
        }
        else
            return "Sorry! patient with id "+id+" does not exist";

    }
    @GetMapping("/showFormForUpdatePatient/{opd_num}")
    public String showFormForUpdate(@PathVariable ( value = "opd_num") int opd_num, Model model) {
        patient pati = new patient();

        patient pat = patients.findByOpd_num(opd_num);

        pati.setOpd_num(pat.getOpd_num());
        pati.setAge(pat.getAge());
        pati.setAddress(pat.getAddress());
        pati.setDate(pat.getDate());
        pati.setEducation(pat.getEducation());
        pati.setFirstname(pat.getFirstname());
        pati.setGender(pat.getGender());
        pati.setHandedness(pat.getHandedness());
        pati.setFamily_histofhand(pat.getFamily_histofhand());
        pati.setInformant(pat.getInformant());
        pati.setLastname(pat.getLastname());
        pati.setMarital_status(pat.getMarital_status());
        pati.setOccupation(pat.getOccupation());
        pati.setReferred_by(pat.getReferred_by());
        pati.setWeight(pat.getWeight());
        model.addAttribute("patient", pati);
        return "update_patient";
    }


    @GetMapping("/deletepatient/{opd_num}")
    public String deletepatient(@PathVariable(value = "opd_num") int opd_num) {

        this.patients.deleteByOpd_num(opd_num);
        return "redirect:/displaypatientdata";
    }

}


