/*
   03) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Ex - Seção 4 - Estrutura sequencial
*/

import java.util.Scanner;

public class Ex01JavaNelio {   
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, diferença;

      System.out.print("Digite o primeiro valor: ");
		A = sc.nextInt();
      System.out.print("Digite o segundo valor: ");
		B = sc.nextInt();
      System.out.print("Digite o terceiro valor: ");
		C = sc.nextInt();
      System.out.print("Digite o quarto valor: ");
		D = sc.nextInt();

		diferença = A * B - C * D;

		System.out.println("DIFERENCA = " + diferença);

		sc.close ();
	}
}

