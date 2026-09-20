
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial da dívida: R$ ");
        double divida = scanner.nextDouble();

        while (divida > 0) {
            System.out.println("Informe o valor do pagamento: R$ ");
            double pagamento = scanner.nextDouble();

            if (pagamento > divida) {
                double troco = pagamento - divida;
                System.out.printf("Dívida quitada! Valor a ser devolvido: R$ %.2f%n", troco);
                scanner.close();
                return;
            } else if (pagamento <= 0) {
                System.out.println("O valor do pagamento não pode ser menor igual a R$ 0,00.");
            } else {
                divida -= pagamento;
                System.out.printf("Pagamento: R$ %.2f - Saldo: R$ %.2f%n", pagamento, divida);
            }
        }

        scanner.close();

        System.out.println("Dívida quitada!");
    }
}
