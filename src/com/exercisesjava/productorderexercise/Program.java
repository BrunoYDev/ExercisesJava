package com.exercisesjava.productorderexercise;

import com.exercisesjava.productorderexercise.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth Date (dd/MM/yyyy): ");
        String clientBirthDate = sc.nextLine();

        Client client = new Client(clientName, clientEmail, sdf.parse(clientBirthDate));

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        Order order = new Order(OrderStatus.valueOf(orderStatus), client);

        sc.nextLine();
        for(int i = 1; i<=items; i++){
            System.out.println("Product #" + i + " data: ");

            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Enter product quantity: ");
            int productQuantity = sc.nextInt();

            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product);
            order.addItem(orderItem);
        }

        System.out.println(order);

    }

}
