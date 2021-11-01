/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class patientDirectory {
    
    private ArrayList<patient> patientD;
    
    public patientDirectory(){
        this.patientD = new ArrayList<patient>();
    
    }

    public ArrayList<patient> getPatientD() {
        return patientD;
    }

    public void setPatientD(ArrayList<patient> patientD) {
        this.patientD = patientD;
    }
  public patient addNewPatient(){
        patient pa = new patient();
        patientD.add(pa);
        return pa;
    }  
}
