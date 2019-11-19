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
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Table t1 = new Table(1, 4, true);
        Table t2 = new Table(2, 4, false);
        Booking b1 = new Booking("Smith", 5, false);        
        Booking b2 = new Booking("Johnson", 3, true);         
        Booking b3 = new Booking("Williams", 7, false);        
        Booking b4 = new Booking("Jones", 2, true);
        Staff s1 = new Staff("Jack");
        Staff s2 = new Staff("Mark");
    }
    
}
