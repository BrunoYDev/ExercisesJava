package com.exercisesjava.productorderexercise.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment = new Date();
    private OrderStatus status;

    private Client client;

    List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for(OrderItem item : items){
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order Moment: " + sdf.format(this.getMoment()) + "\n");
        sb.append("Order Status: " + this.getStatus() + "\n");
        sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order Items: \n");

        for(OrderItem item : items){
            sb.append(item.getProduct().getName() + ", $" + item.getPrice() + ", Quantity: " + item.getQuantity() + " Subtotal: $" + item.subTotal() + "\n");
        }

        sb.append("Total Price: $" + total());

        return sb.toString();
    }
}
