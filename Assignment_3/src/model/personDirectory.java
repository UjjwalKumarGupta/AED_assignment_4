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
    
    
    public boolean uni(String id) {
        for(person p : personD) {
        if(p.getPersonID()==(Integer.parseInt(id)))
        return true;
        }
        return false;
}
    
    
    public void deletePerson(person p){
    personD.remove(p);
}
    
}
