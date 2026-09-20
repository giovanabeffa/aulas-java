
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do investimento inicial:");
        double valorInvestimento = scanner.nextDouble();

        System.out.println("\nInforme a taxa de rendimento mensal:");
        double taxa = scanner.nextDouble();

        System.out.println("\nInforme a quantidade de meses:");
        int meses = scanner.nextInt();

        scanner.close();

        System.out.println("\n");
        
        for (int i = 1; i <= meses; i++) {
            valorInvestimento += valorInvestimento * (taxa / 100);

            System.out.printf("Mês " + i + ": R$ %.2f%n", valorInvestimento);
        } 
    }
}
