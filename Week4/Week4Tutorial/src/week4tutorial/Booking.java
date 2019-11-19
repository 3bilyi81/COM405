/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4tutorial;

/**
 *
 * @author 3bilyi81
 */
public class Booking {
    private String name;
    private int numGuests;
    private boolean isOutside;
    
    
    public Booking(String nameIn, int guests, boolean outside){
        name = nameIn;
        numGuests = guests;
        isOutside = outside;
               
    }
    
    public String getName(){
    return name;
    }
    public int getnumGuests(){
    return numGuests;
    }
    public boolean getisOutside(){
    return isOutside;
    }
}
