/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7tutorial;

/**
 *
 * @author 3bilyi81
 */
public class Week7Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m1 = new Manager("Meh", 70000, 30, 40, 25);
        Admin a1 = new Admin("Bleh", 20000, 25, 40);
        a1.SetManager(m1);
        
        System.out.println(m1.getDetals());
        System.out.println(a1.getDetals());
    }
    
}
