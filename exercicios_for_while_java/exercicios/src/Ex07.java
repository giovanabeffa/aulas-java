
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorVenda = 0;
        double valorTotal = 0;
        int vendas = 0;
        int escolha;
        do {
            System.out.println("Digite o valor da venda:");
            valorVenda = scanner.nextDouble();

            valorTotal += valorVenda;

            vendas++;

            System.out.println("Deseja registrar outra venda?\n1 - Sim\n2- Não");
            escolha = scanner.nextInt();
            
        } while (escolha == 1);

        double media = valorTotal / vendas;
        
        System.out.printf("Total vendido: R$ %.2f%n", valorTotal);
        System.out.printf("Média das venda: R$ %.2f%n", media);
    }
}
