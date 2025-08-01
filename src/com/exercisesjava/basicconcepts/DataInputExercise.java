package com.exercisesjava.basicconcepts;

import java.util.*;

public class DataInputExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Integers Sum
        int x, y;
        try {
            System.out.print("Write an integer: ");
            x = sc.nextInt();
            System.out.print("Write another integer: ");
            y = sc.nextInt();

            System.out.print("The sum of the two integers are: " + (x + y));
        } catch (InputMismatchException ex){
            throw new IllegalArgumentException("ONLY INTEGERS NUMBERS ARE ACCEPTED!!");
        }
        */

        /*
            Discovering Circle Area

            double radius;
            try {

                System.out.print("Write the radius of a circle: ");
                radius = sc.nextDouble();

                double area = Math.PI * (radius * radius);

                System.out.printf("The circle area is: %.4f", area);

            } catch (InputMismatchException ex){
                throw new IllegalArgumentException("ONLY NUMBERS ARE ACCEPTED!!");
            }]
        */

        /* Reading the difference between (A*B) - (C*D) Using a while loop and Scanner
        List<Integer> intList = new ArrayList<>();

        while(intList.size() < 4){
            System.out.print("Input an number: ");
            intList.add(sc.nextInt());
        }

        int difference = (intList.getFirst() * intList.get(1)) - (intList.get(2) * intList.getLast());

        System.out.println("The difference between (A*B) - (C*D) Is: " + difference);
         */

        /* Count a user payment
        int userNumber, workHours;
        double hourRate;

        System.out.print("Input the User number: ");
        userNumber = sc.nextInt();

        System.out.print("Input the User worked hours: ");
        workHours = sc.nextInt();

        System.out.print("Input the User Hour Rate ($ per hour, e.g: 5.50): ");
        hourRate = sc.nextDouble();

        double userPayment = hourRate * workHours;

        System.out.println("User Number: " + userNumber);
        System.out.printf("User Payment: U$ %.2f %n", userPayment);

         */

        /* Calculate the total amount of two items value * quantity
        int obj1Code, obj1Quantity, obj2Code, obj2Quantity;
        double obj1UnitValue, obj2UnitValue;

        System.out.print("Write the object 1 code: ");
        obj1Code = sc.nextInt();

        System.out.print("Write the object 1 quantity: ");
        obj1Quantity = sc.nextInt();

        System.out.print("Write the object 1 unital value: ");
        obj1UnitValue = sc.nextDouble();

        System.out.print("Write the object 2 code: ");
        obj2Code = sc.nextInt();

        System.out.print("Write the object 2 quantity: ");
        obj2Quantity = sc.nextInt();

        System.out.print("Write the object 2 unital value: ");
        obj2UnitValue = sc.nextDouble();

        double total = (obj1UnitValue * obj1Quantity) + (obj2UnitValue * obj2Quantity);

        System.out.printf("Total Value: U$ %.2f %n", total);

        */
    }
}
