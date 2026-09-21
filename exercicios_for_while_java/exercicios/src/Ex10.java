
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        if (valorCompra <= 0) {
            System.out.println("\nValor inválido. Tente novamente.");
            System.out.println("\nDigite o valor da compra:");
            valorCompra = scanner.nextDouble();
        }

        double pagamento = 0;
        double valorTotal = 0;


        while (valorCompra > 0) {
            System.out.println("\nInforme o valor do pagamento:");
            pagamento = scanner.nextDouble();

            if (pagamento <= 0) {
                System.out.println("\nValor inválido. Tente novamente.");
                
            } else {
                valorTotal += pagamento;

                if (pagamento > valorCompra) {
                    double troco = pagamento - valorCompra;
                    valorCompra = 0;

                    System.out.printf("\nPagamento: R$ %.2f - Troco: R$ %.2f%n", pagamento, troco);

                } else {
                    valorCompra -= pagamento;
                    
                    System.out.printf("\nPagamento: R$ %.2f - Restante: R$ %.2f%n", pagamento, valorCompra);
                }
            }
        }

        scanner.close();

        System.out.printf("Valor total recebido: R$ %.2f%n", valorTotal);
    }
}
