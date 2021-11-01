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
public class personDirectory {
    private ArrayList<person> personD;
    
    public personDirectory(){
        this.personD = new ArrayList<person>();
    }

    public ArrayList<person> getPersonD() {
        return personD;
    }

    public void setPersonD(ArrayList<person> personD) {
        this.personD = personD;
    }
    public person addNewPerson(){
        person newPerson = new person();
        personD.add(newPerson);
        return newPerson;
    }
    public person updatePerson(int i, person p) {
        personD.set(i, p);
        return p;}
    
}
