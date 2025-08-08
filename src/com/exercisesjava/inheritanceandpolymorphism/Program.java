package com.exercisesjava.inheritanceandpolymorphism;

import com.exercisesjava.inheritanceandpolymorphism.entities.Employee;
import com.exercisesjava.inheritanceandpolymorphism.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();

        sc.nextLine();
        for(int i = 1; i<=employees; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            String outsourced = sc.nextLine();
            System.out.print("Name: ");
            String employeeName = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(outsourced.charAt(0) == 'n'){
                Employee newEmployee = new Employee(employeeName, hours, valuePerHour);
                employeeList.add(newEmployee);
            }else if (outsourced.charAt(0) == 'y'){
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                OutsourcedEmployee newOutsourcedEmployee = new OutsourcedEmployee(employeeName, hours, valuePerHour, additionalCharge);
                employeeList.add(newOutsourcedEmployee);
            }

            sc.nextLine();
        }

        System.out.println("PAYMENTS: ");
        for(Employee e : employeeList){
            System.out.printf("%s - $%.2f%n", e.getName(), e.payment());
        }

        sc.close();
    }
}
