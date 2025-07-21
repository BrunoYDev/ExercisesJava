package com.exercisesjava.oopconcepts;

public class Product {

    private String Name;
    private double Price;
    private int Quantity;

    public Product(String Name,double Price){
        this.Name = Name;
        this.Price = Price;
    }

    public void SetPrice(double price){
        this.Price = price;
    }

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
