
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorVenda = 0;
        double valorTotal = 0;
        int escolha;
        do {
            System.out.println("Digite o valor da venda:");
            valorVenda = scanner.nextDouble();

            valorTotal += valorVenda;

            System.out.println("Deseja registrar outra venda?\n1 - Sim\n2- Não");
            escolha = scanner.nextInt();
            
        } while (escolha == 1);
        
        System.out.printf("Total vendido: R$ %.2f%n", valorTotal);
    }
}
