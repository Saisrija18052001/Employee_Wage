package com.arrays;

public class Employee_present_UC1 {
    public static void main(String[] args) {
        int is_full_emp=1;
        double emp=Math.floor(Math.random()*10)%2;
        if(emp==is_full_emp){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
