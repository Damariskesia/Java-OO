package Application;

import java.util.Scanner;

import entities.Product;


public class ProgramDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

       //product.name = "computer"; // This is not possible because the attribute is private

        //product.setName("Computer");

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
