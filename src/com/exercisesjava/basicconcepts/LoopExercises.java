package com.exercisesjava.basicconcepts;

import java.util.Locale;
import java.util.Scanner;

public class LoopExercises {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercises Using While
        /* Verify if a password is correct Loop While
            String password;

            System.out.print("Insert the password: ");
            password = sc.nextLine();

            while(!password.equals("2002")){
                System.out.println("Incorrect Password!");
                System.out.print("Try again: ");
                password = sc.nextLine();
            }

            System.out.println("Correct Password, you´re in :D ");
         */

        /* Receive two coordinates X and Y and give the quadrant of the point in the cartesian plane
            int x = 1, y = 1;

            while(x != 0 && y != 0){
                System.out.print("Write an X position (e.g: 3): ");
                x = sc.nextInt();

                System.out.print("Write an Y position (e.g: 2): ");
                y = sc.nextInt();

                if(x > 0 && y > 0){
                    System.out.println("Second");
                }else if (x > 0 && y < 0){
                    System.out.println("Fourth");
                }else if (x < 0 && y > 0){
                    System.out.println("First");
                }else{
                    System.out.println("Third");
                }

            }
         */

        /* Using while to create a gas station like console, can use do while to short the code
            int choice;
            int alc = 0;
            int gas = 0;
            int dis = 0;

            System.out.println("Welcome to gas station!!");
            System.out.println("Choose an option: ");
            System.out.println("1: Alcohol");
            System.out.println("2: Gasoline");
            System.out.println("3: Diesel");
            System.out.println("4: End Program");
            choice = sc.nextInt();

            while(choice != 4){
                switch (choice){
                    case 1:
                        alc += 1;
                        break;
                    case 2:
                        gas += 1;
                        break;
                    case 3:
                        dis += 1;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Welcome to gas station!!");
                System.out.println("Choose an option: ");
                System.out.println("1: Alcohol");
                System.out.println("2: Gasoline");
                System.out.println("3: Diesel");
                System.out.println("4: End Program");
                choice = sc.nextInt();
            }

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("End of the day!");
            System.out.println("Total sells: ");
            System.out.println("Alcohol: " + alc);
            System.out.println("Gasoline: " + gas);
            System.out.println("Diesel: " + dis);
         */

        /* Write every Even number between 1 and X(1000)
            System.out.print("Write a number between 1 and 1000: ");
            int x = sc.nextInt();

            if(x >= 1 && x <= 1000){
                for (int i = 0; i < x; i++){
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
            }
         */

        /* Verify how many number are in the interval [10,20]
            System.out.print("How many numbers to verify: ");
            int N = sc.nextInt();

            int in = 0, out = 0;

            for(int i=0; i<N; i++){
                System.out.print("Add a number to verify: ");
                int x = sc.nextInt();
                if(x <= 20 && x >= 10){
                    in++;
                }else{
                    out ++;
                }
            }

            System.out.printf("%d in %n%d out", in, out);
         */

        /* Retrieve the number, the square of the number, and the cube
            System.out.print("Write an integer positive number: ");
            int N = sc.nextInt();

            for(int i=1; i<=N; i++){
                System.out.println(i +" "+ i*i + " " + i*i*i);
            }
         */
    }
}
