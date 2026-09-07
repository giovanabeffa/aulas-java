
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digeite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }
}
