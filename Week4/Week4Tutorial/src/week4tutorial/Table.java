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
public class Table {
    private int number;
    private int numSeats;
    private boolean isOutside;
    
    private Staff allocatedStaff;
    private Booking tableBooking;
    
    public Table(int numberIn, int seatsIn, boolean outside){
    number = numberIn;
    numSeats = seatsIn;
    isOutside = outside;
    
    tableBooking = null;
    allocatedStaff = null;
          
    }
    public void AssignStaffMember(Staff staffIn){
    allocatedStaff = staffIn;
    }
    public boolean bookTable(Booking bookIn){
        if(tableBooking != null){
            
            
        if(numSeats >= bookIn.getnumGuests() && bookIn.getnumGuests() < numSeats-2 && isOutside == bookIn.getisOutside()){
        tableBooking = bookIn;
        return true;
        }
        }
        return false;
        
    }
    public void clearBooking(){
    tableBooking = null;
    }
    public Staff getStaffMember(){
    return allocatedStaff;
    }
}
