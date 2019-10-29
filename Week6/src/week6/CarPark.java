/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 3bilyi81
 */
public class CarPark {

    private Car[] carCarPark;

    public CarPark() {
        carCarPark = new Car[15];
    }

    public boolean addCar(Car carIn) {
        for (int i = 0; i < carCarPark.length; i++) {
            if (carCarPark[i] == null) {
                carCarPark[i] = carIn;
                return true;
            }

        }
        return false;
    }

    public boolean removeCar(int rpIn) {
        for (int i = 0; i < carCarPark.length; i++) {
            if (carCarPark[i] != null) {
                String carRP = carCarPark[i].getRP();
                if (carRP.equals(rpIn)) {
                    carCarPark[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
