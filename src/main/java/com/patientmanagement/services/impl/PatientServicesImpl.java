package com.patientmanagement.services.impl;

import com.patientmanagement.dao.PatientDao;
import com.patientmanagement.models.Patient;
import com.patientmanagement.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by enock on 5/7/15.
 */
public class PatientServicesImpl implements PatientServices{

    @Autowired
    PatientDao patientDao;
    @Override
    public int insertRow(Patient patient) {   return patientDao.insertRow(patient);  }

    @Override
    public Patient getPatientbyid(int id) {
        return patientDao.getPatientbyid(id);
    }

    @Override
    public List<Patient> getList() {
        return patientDao.getList();
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
