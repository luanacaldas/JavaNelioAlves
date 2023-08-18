/*
   04) Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago..
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex01JavaNelio {   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int CodigoPeca1, NumeroPeca1, CodigoPeca2, NumeroPeca2;
        double ValorPeca1, ValorPeca2, t2otal; // Correção na nomenclatura da variável

        System.out.println("Digite o código da Peça 1:");
        CodigoPeca1 = sc.nextInt();
        System.out.println("Digite o número da Peça 1:");
        NumeroPeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário da Peça 1:");
        ValorPeca1 = sc.nextDouble();

        System.out.println("Digite o código da Peça 2:");
        CodigoPeca2 = sc.nextInt();
        System.out.println("Digite o número da Peça 2:");
        NumeroPeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário da Peça 2:");
        ValorPeca2 = sc.nextDouble();

        total = ValorPeca1 * NumeroPeca1 + ValorPeca2 * NumeroPeca2; 

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
    }
}
