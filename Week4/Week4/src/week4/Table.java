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
public class Table {
    private int tableNumber;
    private int numberSeats;
    private boolean inside;
    private boolean outside;
    private Staff staffMember;
    private Booking booking;
    public Table(int tableNumberIn, int numberSeatsIn, boolean insideIn){
    tableNumber = tableNumberIn;
    numberSeats = numberSeatsIn;
    inside = insideIn;
    
    }   
    public void setAssignStaffMember(Staff AssignStaffMember){
    staffMember = AssignStaffMember;
    }
    public void bookTable(Booking bookIn){
    if(numberSeats <= bookIn.getNumberGuests()){
    
    }
    }
    public void clearBooking(Booking bookingOut){
        if(){
        
        }
    }
}
