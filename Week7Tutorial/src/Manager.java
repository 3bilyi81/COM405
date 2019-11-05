/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3bilyi81
 */
public class Manager extends Employee{
    
    private int bonus;
    
    public Manager(String nameIn, double payIn, int hols, int hrs, int bonusIn){
    super(nameIn, payIn, hols, hrs);
    bonus = bonusIn;
    }
    
    public boolean setBonus(int bonusIn){
    if(bonusIn >= 0 && bonusIn <= 100){
    bonus = bonusIn;
    return true;
    }
    return false;
    }
    
    @Override
    public double getYearlySalary(){
    return (bonus*(pay/100)) + pay; 
            
    }
    
}

