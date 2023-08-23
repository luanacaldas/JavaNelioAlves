/*
    Exercício 04
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

    import java.util.Scanner;

    public class Ex01JavaNelio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = scanner.nextInt();

        final int HORAS_NO_DIA = 24;

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (HORAS_NO_DIA - horaInicial) + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
