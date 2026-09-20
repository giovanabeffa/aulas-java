
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de medições:");
        int medicoes = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= medicoes; i ++) {
            System.out.println("Informe a temperatura:");
            double temperatura = scanner.nextDouble();
        }


    }
}
