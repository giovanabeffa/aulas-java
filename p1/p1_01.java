
import java.util.Scanner;

public class p1_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua nota de 0 a 10:");
        int nota = scanner.nextInt();

        System.out.println("Insira o número de faltas:");
        int faltas = scanner.nextInt();

        if (nota >= 7 && faltas < 10) {
            System.out.println("\nNota: " + nota);
            System.out.println("Faltas: " + faltas);
            System.out.println("Status: Aprovado.");
        } else {
            System.out.println("\nNota: " + nota);
            System.out.println("Faltas: " + faltas);
            System.out.println("Status: Reprovado.");
        }
    }
}
