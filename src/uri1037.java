import java.util.Scanner;
import java.util.Locale;
public class Ex01JavaNelio {
public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0, 25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25, 50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50, 75]");
        }        
        else {
            System.out.println("Intervalo (75, 100]");
        }
        
        scanner.close();
    }
}
