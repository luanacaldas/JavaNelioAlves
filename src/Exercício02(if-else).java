/*
   Exercício 02
   Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

import java.util.Scanner;

public class Ex01JavaNelio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("O número é par (zero é considerado par).");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}
