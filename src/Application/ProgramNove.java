package Application;

import java.util.Scanner;

public class ProgramNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double soma= 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];

        }

        double media = soma / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", media);


        sc.close();
    }
}