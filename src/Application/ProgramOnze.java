package Application;

import java.util.Scanner;

public class ProgramOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você quer?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Negativos:");
        for(int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}

