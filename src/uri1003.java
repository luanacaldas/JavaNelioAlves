/*
   01) Programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa.
Ex - Seção 4 - Estrutura sequencial
*/

import java.util.Scanner;

public class Ex01JavaNelio {   
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

      System.out.print("Digite o primeiro valor inteiro: ");
		A = sc.nextInt();
      System.out.print("Digite o segundo valor inteiro: ");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close ();
	}
}
