
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de trechos:");
        int trechos = scanner.nextByte();

        double kmTotal = 0;
        double totalCombustivel = 0;

        for (int i = 1; i <= trechos; i++) {
            System.out.println("\nTrecho " + i);

            System.out.println("Informe a quantidade de quilômetros percorridos:");
            double kmPercorrido = scanner.nextDouble();

            System.out.println("\nInforme a quantidade de litros de combustível utilizados:");
            double litrosCombustivel = scanner.nextDouble();

            kmTotal += kmPercorrido;
            totalCombustivel += litrosCombustivel;
        }

        double consumoMedio = 0;
        consumoMedio = kmTotal / totalCombustivel;


        System.out.println("\nQuilometragem total: " + kmTotal + " km");
        System.out.println("Combustível utilizado: " + totalCombustivel + " litros");
        System.out.println("Consumo médio: " + consumoMedio + " km/l");

        scanner.close();
    }
}
