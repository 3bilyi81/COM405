/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author 3bilyi81
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarPark cp = new CarPark();

        cp.addCar(new Car("08097"));

        System.out.println(cp.toString());

        System.out.println("Please select one of the following options: ");
        System.out.println("A - Add a car");
        System.out.println("B - Remove a car");
        System.out.println("C - View number of free spaces/number of cars in the car park");
        System.out.println("X - Quit");
        Scanner scanIn = new Scanner(System.in);
        String input = scanIn.nextLine();
        scanIn.close();
        System.out.println("You entered: " + input);

    }

}
