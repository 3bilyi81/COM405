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
public class Week4Tutorial {

   
    public static void main(String[] args) {
        Booking b1 = new Booking("meh", 3, true);
        Booking b2 = new Booking("Lalala", 15, false);
        
        Table t1 = new Table(1, 5, true);
        Table t2 = new Table(2, 10, false);
        
        Staff s1 = new Staff("Bleh");
        
        if(t1.bookTable(b1)){
        System.out.println("Booking sucessful");
        }
        else {
        System.out.println("Table is not suitable");
        }
        t1.getStaffMember().getName();
        
    }
    
}
