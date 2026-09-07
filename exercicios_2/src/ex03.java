
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        if (nota >= 6.0) {
            System.out.println("Nota: " + nota + "\nAprovado.");
        } else if (nota >= 4.9 && nota <= 5.9) {
            System.out.println("Nota: " + nota + "\nRecuperação.");
        } else {
            System.out.println("Nota: " + nota + "\nReprovado.");
        }

        scanner.close();
    }
}
