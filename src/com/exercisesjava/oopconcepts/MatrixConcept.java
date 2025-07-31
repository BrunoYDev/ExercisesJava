package com.exercisesjava.oopconcepts;

import java.util.Scanner;

public class MatrixConcept {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m,n;
        System.out.print("How many lines the matrix should have? ");
        m = sc.nextInt();
        System.out.print("How many columns the matrix should have? ");
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                // Write n items in sequence separated by spaces then press enter.
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Write a number in the matrix: ");
        int choice = sc.nextInt();

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++ ){
                if(choice == matrix[i][j]){
                    System.out.printf("Position: %d,%d %n", i, j);
                    if(j != 0){
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if(j != matrix[i].length-1){
                        System.out.println("Right: "+ matrix[i][j+1]);
                    }
                    if(i != 0){
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if(i != matrix.length-1){
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
