
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial da dívida:");
        double divida = scanner.nextDouble();

        System.out.println("Informe o a taxa de juros mensal:");
        double juros = scanner.nextDouble();

        System.out.println("Informe a quantidade de meses:");
        int meses = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= meses; i++) {
            
            divida = divida + (divida * (juros/100));

            System.out.printf("Mês " + i + ": R$ %.2f%n", divida);
        }
    }
}
