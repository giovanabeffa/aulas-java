
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o sinal da operação matemática (+, -, *, /):");
        char sinal = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (sinal) {
            case '+':
                resultado = numero1 + numero2;
                break;

            case '-':
                resultado = numero1 - numero2;
                break;

            case '*':
                resultado = numero1 * numero2;
                break;

            case '/':
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por 0.");
                    operacaoValida = false;
                } else {
                    resultado = numero1 / numero2;
                }
                break;

            default:
                System.out.println("Operação inválida. Tente novamente.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println(numero1 + " " + sinal + " " + numero2 + " = " + resultado);
        }

        scanner.close();
    }
}
