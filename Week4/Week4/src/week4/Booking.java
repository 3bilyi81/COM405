/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author 3bilyi81
 */
public class Booking {
    private String name;
    private int numberGuests;
    private boolean dineOutside;
    public String getName(){
    return name;
    }
    public int getNumberGuests(){
    return numberGuests;
    }
    public boolean getDineOutside(){
    return dineOutside;
    }
    public Booking(String nameIn, int numberGuestsIn, boolean dineOutsideIn){
    name = nameIn;
            numberGuests = numberGuestsIn;
                    dineOutside = dineOutsideIn;
    }
}

