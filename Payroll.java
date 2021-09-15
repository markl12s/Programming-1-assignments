/*
 * COURSE : Computer Programming I
 *
 * ASSIGNMENT : 2
 * PROGRAM : Payroll.java
 * PROGRAMMER : Mark Leard
 *
 * DESCRIPTION : calculates how much you are payed in a week
 *
 * LAST MODIFIED : 9/14/2021
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        //work hours variable
        double workHours = 40.00;
        //overtime hours variable
        double overtimeHours = 10.00;
        //pay rate variable
        double payRate = 13.0;

        //calculate pay
        //overtime = overtime + 1/2 overtime
        double halfOvertime = overtimeHours / 2;
        overtimeHours += halfOvertime;

        //total hours
        double totalPay = (workHours + overtimeHours) * payRate;

        System.out.println("you will earn " + totalPay + " this week");
    }
}
