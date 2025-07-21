package com.exercisesjava.oopconcepts;

public class Product {

    String Name;
    double Price;
    private int Quantity;

    public double TotalValueInStock(){
        return Price * Quantity;
    }

    public void AddProducts(int Quantity){
        this.Quantity += Quantity;
    }

    public void RemoveProducts(int Quantity){
        this.Quantity -= Quantity;
    }
}
