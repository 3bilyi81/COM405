/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3bilyi81
 */
public class Admin extends Employee{
    
    private Manager assignedManager;
    
    public Admin(String nameIn, double payIn, int hols, int hrs){
    super(nameIn, payIn, hols, hrs);
    
    }
    
    public Manager getManager(){
    return assignedManager;
    
    }
    
    public void setManager(Manager managerIn){
    assignedManager = managerIn;
    }
    
    @Override
    public String getDetails(){
    String ret = super.getDetails();
    if(assignedManager != null){
    ret += " " + assignedManager.getName();
    }
    else{
    ret += "No manager assigned";
    }
    
    return ret;
    
    }
    
}
