
import java.util.Scanner;

public class p1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            total += notas[i];
        }

        double media = total / notas.length;

        int nota = 0;
        
        System.out.println("\nNOTAS INFORMADAS:");
        while (nota < notas.length) {
            System.out.println("Nota " + (nota + 1) + ": " + notas[nota]);
            nota++;
        }
        System.out.printf("\nMédia: %.2f%n", media);

        scanner.close();
    }
}
