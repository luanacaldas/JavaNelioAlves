/*
   04) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.util.Scanner;
import java.util.Locale;

public class Ex01JavaNelio {   
public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

       System.out.println("Digite o número do funcionário:");
	    numero = sc.nextInt();
       System.out.println("Digite as horas trabalhadas do funcionário:");
	    horas = sc.nextInt();
       System.out.println("Digite o valor que recebe por hora:");
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
