package com.patientmanagement.controllers;

import com.patientmanagement.models.Patient;
import com.patientmanagement.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by enock on 5/7/15.
 */

@Controller
public class Patientcontroller {
    @Autowired
    PatientServices patientServices;

    @RequestMapping("/index")
    public ModelAndView hello1() {

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO SPRING MVC");
        model.setViewName("patient");

        return model;
    }

    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                               @RequestParam(value = "lname", required = false) String lname,
                               @RequestParam(value = "dao", required = false) String dao)

    {
        ModelAndView model = new ModelAndView();

        {
            Patient patient = new Patient();
            patient.setFname(fname);
            patient.setLname(lname);
            patient.setDao(dao);
            patientServices.insertRow(patient);
        }

        model.setViewName("patient");
        return model;
    }

    @RequestMapping("/list")
    public void list() {

//        List<Patient> patientList =  PatientServices.getList();
//
//        for (Patient patient : patientList){
//            System.out.println(patient.getFname() + " " + patient.getLname() +" "+ patient.getDao());
//            System.out.println("\n\n**********************************\n\n");
//        }

        Patient patient = new Patient();

        patient = PatientServices.getPatientbyid(1);

        System.out.println(patient.getFname() + " " + patient.getLname() + "" +
                " " + patient.getDao());

    }
}
