
import java.util.Scanner;

public class Calculadora2 {
    // Resolução do exercício feita pelo professor em sala
    public static int calcularSoma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public static int calcularSubtracao(int a, int b) {
        int resultado;
        resultado = a - b;
        return resultado;
    }

    public static int calcularMultiplicacao(int a, int b) {
        int resultado;
        resultado = a * b;
        return resultado;
    }

    public static double calcularDivisao(int a, int b) {
        int resultado = 0;

        if (b > 0) {
            resultado = a / b;

        } else {
            System.out.println("Não é possível realizar a divisão!");
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = calcularSoma(num1, num2);
        System.out.println("O resultado da soma é: " + resultado);

        resultado = calcularSubtracao(num1, num2);
        System.out.println("O resultado da subtração é: " + resultado);

        resultado = calcularMultiplicacao(num1, num2);
        System.out.println("O resultado da multiplicação é: " + resultado);

        double resultadoDiv = calcularDivisao(num1, num2);
        System.out.println("O resultado da divisão é: " + resultadoDiv);
    }
}
