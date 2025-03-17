package org.udemy.UnidadeOito.Estoque;


import java.util.Scanner;
import java.util.Locale;

public class ProductMain {

    public static void main (String [] args){

        Scanner sc  = new Scanner(System.in);
        Locale locale = new Locale("pt", "BR");


        Product product =  new Product();



        System.out.println("Enter product data:");


        System.out.print("Name: ");
        product.name = sc.next();
        System.out.println();


        System.out.print("Price: " );
        product.price = sc.nextDouble();
        System.out.println();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.printf("\n\n");


        System.out.println("Product data: " + product);


        System.out.print("\nEnter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());
        System.out.println();


        System.out.println("Updated data: " + product.toString());

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        product.RemoveProcucts(sc.nextInt());

        System.out.println("Updated data: " + product.toString());


    } // fim da main

} // fim da classeProductMain
