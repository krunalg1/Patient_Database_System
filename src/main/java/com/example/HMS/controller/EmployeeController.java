package com.example.HMS.controller;

import com.example.HMS.entity.Diagnosis;
import com.example.HMS.entity.Employee;
import com.example.HMS.entity.Etiology;
import com.example.HMS.entity.Past_treatment;
import com.example.HMS.repository.EtiologyRepository;
import com.example.HMS.repository.diagnosisRepository;
import com.example.HMS.repository.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private diagnosisRepository diagnrepo;

    @Autowired
    private EtiologyRepository etioRepo;


   /* @GetMapping("/")
    public String viewTable(Model model)
    {
        return "table";
    }*/
    @GetMapping("/newfinal_diagnosis")
    public String viewDiagnosis(Model model)
    {
        // create model attribute to bind form data
        Etiology etiology = new Etiology();

        Diagnosis diagnosis = new Diagnosis();

        model.addAttribute("etiology", etiology);
        model.addAttribute("diagnosis" , diagnosis);

        return "final_diagnosis";
    }
    // display list of employees
    @GetMapping("/index")
    public String viewHomePage(Model model) {

        model.addAttribute("final_di" , diagnrepo.findAll() );
        model.addAttribute("listEmployees" ,employeeService.getAllEmployees());
        return "index_employee";
        //	return findPaginated(1, "firstName", "asc", model);
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }


    @RequestMapping("/saveDignosis")
    public String saveDignosis(  Diagnosis diagnosis ,Etiology etiology)
    {
// 		Etiology etiology = new Etiology();
        etioRepo.save(etiology);
        diagnrepo.save(diagnosis);
        return "redirect:/";
    }

    @GetMapping("/final_report")
    public String seeReport(  Model model)
    {
        model.addAttribute("final_etio" , etioRepo.findAll() );
        model.addAttribute("final_di" , diagnrepo.findAll() );
        return "final_report";
    }

    @RequestMapping("/searchDignosis")
    @ResponseBody
    public String search(int id , Model model)
    {
        if( diagnrepo.existsById(id))
        {
            return diagnrepo.findById(id).orElse(null).toString();
        }
        else
        {
            return "Employee with id "+id+"does not exist...!";
        }
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

/*    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {

        // get employee from the service
        Employee employee = employeeService.getEmployeeById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }*/

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id") long id) {

        // call delete employee method


        this.employeeService.deleteEmployeeById(id);
        return "redirect:/index";
    }

    @GetMapping("/Ictus")
    public String viewPast(Model model)
    {
        // create model attribute to bind form data
        Etiology etiology = new Etiology();

        Diagnosis diagnosis = new Diagnosis();
        Past_treatment past_treat = new Past_treatment();


        model.addAttribute("past_treat", past_treat);

        return "Ictus";
    }

}
