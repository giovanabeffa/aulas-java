
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da dívida: R$:");
        double divida = scanner.nextDouble();

        System.out.println("\nInforme o valor máximo do pagamento mensal:");
        double pagamentoMax = scanner.nextDouble();
        
        double total = 0;
        int pagamentos = 0;

        while (divida > 0) {
            System.out.printf("\nSaldo: R$ %.2f%n", divida);

            System.out.println("Informe o valor do pagamento: R$");
            double pagamento = scanner.nextDouble();

            if ( pagamento <= 0) {
                System.out.println("\nValor inválido. Tente novamente");
            } else if (pagamento > pagamentoMax) {
                System.out.printf("\nO valor informado é maior que o limite máximo mensal de R$ %.2f. Tente novamente.", pagamentoMax);
            } else if (pagamento > divida) {
                System.out.printf("\nO valor informado é maior que o saldo restante da dívida de R$ %.2f. Tente novamente.", divida);
            } else {
                divida -= pagamento;
                total += pagamento;
                pagamentos++;
            }
        }

        scanner.close();

        System.out.println("\nDívida quitada!");
        System.out.printf("Total pago: R$ %.2f%n", total);
        System.out.println("Quantidade de pagamentos: " + pagamentos);
    }
}
