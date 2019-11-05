/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3bilyi81
 */
public class FrontLineStaff extends Employee{
    public FrontLineStaff(String nameIn, double payIn, int hols, int hrs){
    super(nameIn, payIn, hols, hrs);
    }
    
    @Override
    public double getYearlySalary(){
    return (pay * hours)*52;
    }
}
