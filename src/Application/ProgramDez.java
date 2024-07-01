
package Application;

import java.util.Scanner;

import entities.ProductDois;

public class ProgramDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        ProductDois[] vect = new ProductDois[n];

        double sum=0;
        for (int i=0;i< vect.length;i++){
            sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            vect[i] = new ProductDois(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
