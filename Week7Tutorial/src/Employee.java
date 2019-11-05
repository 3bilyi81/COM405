/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3bilyi81
 */
public class Employee {
    protected String name;
    protected double pay;
    protected int holiday;
    protected int hours;
    
    
    
    public Employee(String nameIn, double payIn, int hols, int hrs){
    name = nameIn;
    pay = payIn;
    holiday = hols;
    hours = hrs;
    }
    
    public void setPay(double payIn){
    pay = payIn;
    }
    public boolean setHours(int hoursIn){
    if(hoursIn <= 40){
        hours = hoursIn;
        return true;
    }
    return false;
    
    }
    public double getYearlySalary(){
    return pay;
    }
    public boolean bookHoliday(int reduceBy){
    if(holiday - reduceBy >= 0){
    holiday -= reduceBy;
    return true;
    }
    return false;
    }
    public String getDetails(){
    return name + " " + holiday + " " + getYearlySalary(); 
    }
    
    public String getName(){
    return name;
    }
    
}
