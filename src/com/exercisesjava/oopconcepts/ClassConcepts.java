package com.exercisesjava.oopconcepts;

import java.util.Locale;

public class ClassConcepts {

    public static void main(String[] args){

        Locale.setDefault(Locale.US); // Change the format location to US

        Product banana = new Product("Banana", 5.30);

        banana.AddProducts(10);

        System.out.printf("Total Banana Value: $ %.2f%n", banana.TotalValueInStock());

        banana.SetPrice(6.59);
        System.out.printf("Total Banana Value: $ %.2f", banana.TotalValueInStock());
    }
}

