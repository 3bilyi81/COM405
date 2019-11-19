/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author 3bilyi81
 */
public class Car {
    
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel   ;
    
    public int getcurrentSpeed() {
    return currentSpeed;
    }
    public int getmaxSpeed() {
    return maxSpeed;
    }
    public int getfuelLevel() {
    return fuelLevel;
    }
    public void setcurrentSpeed(int currentSpeedIn) {
    currentSpeed = currentSpeedIn;
  }
    public void setmaxSpeed(int maxSpeedIn) {
    maxSpeed = maxSpeedIn;
  }
    public void setfuelLevel(int fuelLevelIn) {
    fuelLevel = fuelLevelIn;
  }
    public void accelerate(){
        if(currentSpeed >= 50){
    currentSpeed = currentSpeed + 50;
    fuelLevel = fuelLevel - 20;    
        }
        else if(maxSpeed > 150){
        currentSpeed = 150;
        }
        else if(fuelLevel == 0){
        currentSpeed = currentSpeed + 0;
        }
        
    }
    public void brake(){
        if(fuelLevel == 0){
    currentSpeed = 1;
        }
        
    }
    public void refuel(){
        if(fuelLevel == 20){
    fuelLevel = fuelLevel + 80;
        }
        else if(fuelLevel > 100){
            fuelLevel = 100;
        }
       else if(fuelLevel < 0){
           fuelLevel = 0;
       }
    }
    public Car(){
        currentSpeed = 80;
        maxSpeed = 170;
        fuelLevel = 100;
        
    }
    public Car(int currentSpeedIn,int maxSpeedIn, int fuelLevelIn){
            currentSpeed = currentSpeedIn;
            maxSpeed = maxSpeedIn;
            fuelLevel = fuelLevelIn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car C1 = new Car();
        Car C2 = new Car();
            
        C1.setcurrentSpeed(70);
        C1.setmaxSpeed(150);
        C1.setfuelLevel(100);
        
        C2.setcurrentSpeed(70);
        C2.setmaxSpeed(150);
        C2.setfuelLevel(100);
        
        System.out.println("Curren Speed " + C1.getcurrentSpeed());
        System.out.println("Max Speed " + C1.getmaxSpeed());
        System.out.println("Fuel Level " + C1.getfuelLevel());
        
        System.out.println("Curren Speed " + C2.getcurrentSpeed());
        System.out.println("Max Speed " + C2.getmaxSpeed());
        System.out.println("Fuel Level " + C2.getfuelLevel());
            
        C1.accelerate();
        C1.brake();
        C1.refuel();
        
        C2.accelerate();
        C2.brake();
        C2.refuel();
        
        System.out.println("Curren Speed " + C1.getcurrentSpeed());
        System.out.println("Max Speed " + C1.getmaxSpeed());
        System.out.println("Fuel Level " + C1.getfuelLevel());
        
        System.out.println("Curren Speed " + C2.getcurrentSpeed());
        System.out.println("Max Speed " + C2.getmaxSpeed());
        System.out.println("Fuel Level " + C2.getfuelLevel());
            
        Car C3 = new Car();
        Car C4 = new Car();
        System.out.println("Car 3 current speed: " + C3.getcurrentSpeed());
        System.out.println("Car 4 current speed: " + C4.getcurrentSpeed());
        
    }       
    
}
