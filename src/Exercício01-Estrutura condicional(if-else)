/*
   Exercício 01
   Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01JavaNelio {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número para descobrir se ele é negativo ou não:");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("O número é NEGATIVO.");
            } else {
                System.out.println("O número NÃO É NEGATIVO.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro.");
        } finally {
            scanner.close();
        }
    }   
}
