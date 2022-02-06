package com.bridgelabz;

public class EmployeeWageBuilderUC3 {
    public static void main(String[] args) {
        //Constant
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //Variables
        int empHours = 0;
        int empWage = 0;
        //Computation
        double empCheck = Math.floor(Math.random () * 10)%3;
        if (empCheck == IS_FULL_TIME ) {
            empHours = 8;
        }
        else if (empCheck == IS_PART_TIME ) {
            empHours = 4;
        } else {
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is " +empWage);
    }
}
