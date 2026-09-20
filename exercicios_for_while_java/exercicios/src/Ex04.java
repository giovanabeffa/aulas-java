
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de medições:");
        int medicoes = scanner.nextInt();

        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double total = 0;

        for (int i = 1; i <= medicoes; i ++) {
            System.out.println("Informe a temperatura:");
            double temperatura = scanner.nextDouble();

            total += temperatura;

            if (temperatura > maior) {
                maior = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }
        }

        scanner.close();

        double media = total / medicoes;
        
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Temperatura média: " + media);
    }
}
