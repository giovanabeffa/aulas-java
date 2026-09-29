
import java.util.Scanner;

public class p1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int vendas = 0;
        double valor;

        do {
            System.out.println("Insira  o valor da venda: R$");
            valor = scanner.nextDouble();

            if (valor != 0) {
                vendas++;
                total += valor;
            }
        } while (valor != 0);

        double media = total / vendas;

        System.out.println("\n=== RESUMO DAS VENDAS ===");
        System.out.println("Vendas realizadas: " + vendas);
        System.out.printf("Valor total vendido: R$ %.2f%n", total);
        if (total == 0) {
            System.out.println("Média: R$ 0,00");
        } else {
            System.out.printf("Valor médio das vendas: R$ %.2f%n", media);
        }

        scanner.close();
    }
}
