package com.patientmanagement.dao;

import com.patientmanagement.models.Patient;

import java.util.List;

/**
 * Created by enock on 5/7/15.
 */
public interface PatientDao {

    public int insertRow(Patient patient);

    public Patient getPatientbyid(int id);

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int id);

}
