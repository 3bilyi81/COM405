/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 3bilyi81
 */
public class Employee {

    protected String name;
    protected int payRate;
    protected int weekHours;
    protected int holidayDays;

    public Employee(String nameIn, int payRateIn, int weekHoursIn, int holidayDaysIn) {
        name = nameIn;
        payRate = payRateIn;
        weekHours = weekHoursIn;
        holidayDays = holidayDaysIn;

    }

    public String getName() {
        return name;
    }

    public int getpayRate() {
        return payRate;
    }

    public int getweekHours() {
        return weekHours;
    }

    public int getholidayDays() {
        return holidayDays;
    }

}
