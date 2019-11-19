/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Darren
 */
public class Car {
    private String reg;
    private String colour;
    
    public Car(String regIn, String colourIn)
    {
        reg = regIn;
        colour = colourIn;
    }
    
    public String getReg()
    {
        return reg;
    }
    
    public String getColour()
    {
        return colour;
    }
}
