package com.exercisesjava.oopconcepts;

public class ClassConcepts {

    public static void main(String[] args){

        Product banana = new Product("Banana", 5.30);

        banana.AddProducts(10);

        System.out.printf("Total Banana Value: $ %.2f", banana.TotalValueInStock());
    }
}

