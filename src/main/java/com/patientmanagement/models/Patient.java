package com.patientmanagement.models;

import javax.persistence.*;

/**
 * Created by derric on 5/5/15.
 */

@Entity
@Table(name="patient_info")
public class Patient {
    @Id
    @GeneratedValue

   @Column (name="Patient_id")
   private int Patient_id;

    @Column(name="fname")
    private String fname;

    @Column(name="lname")
    private String lname;

    @Column (name="DateOfBirth")
    private String dao;

    public int getPatient_id() {   return Patient_id;    }

    public void setPatient_id(int Patient_id) {       this.Patient_id = Patient_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {        return lname;    }

    public void setLname(String lname){ this.lname = lname;  }


    public String getDao() {
        return dao;
    }

    public void setDao(String dao) {
        this.dao = dao;
    }
}

