package com.exercisesjava.oopconcepts;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeStudentRent {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms do you want to rent? (0 - 10) ");
        int toRent = sc.nextInt();

        Student[] RoomsToRent = new Student[10];

        for(int i = 0; i<toRent; i++){
            System.out.print("What room you want to rent? (0 - 9) ");
            int room = sc.nextInt();

            while(RoomsToRent[room] != null) {
                System.out.print("Please select a empty room: ");
                room = sc.nextInt();
            }

            System.out.print("What is the student name? ");
            sc.nextLine();
            String studentName = sc.nextLine();
            System.out.print("What is the student email? ");
            String studentEmail = sc.nextLine();

            RoomsToRent[room] = new Student(studentName, studentEmail, room);
        }

        int rentCounter = 0;
        System.out.println(" ");
        for(int j = 0; j<RoomsToRent.length; j++){
            if(RoomsToRent[j] != null){
                rentCounter++;
                System.out.println("Rent #" + rentCounter);
                System.out.println("Name: " + RoomsToRent[j].getName());
                System.out.println("Email: " + RoomsToRent[j].getEmail());
                System.out.println("Room: " + RoomsToRent[j].getRoom());
                System.out.println(" ");
            }
        }

        sc.close();
    }
}
