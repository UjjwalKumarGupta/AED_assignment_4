/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class patient {
    private double temp;
    private double bp;
    private int pul;
    private String Edate;
    private int eno;
    private int Pid;
    private String Comm;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public int getPul() {
        return pul;
    }

    public void setPul(int pul) {
        this.pul = pul;
    }

    public String getEdate() {
        return Edate;
    }

    public void setEdate(String Edate) {
        this.Edate = Edate;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }
    
    @Override
    public String toString(){
        return Edate;}

    public String getComm() {
        return Comm;
    }

    public void setComm(String Comm) {
        this.Comm = Comm;
    }
    
    
}
