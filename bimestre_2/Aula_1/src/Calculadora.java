import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Somar (+)");
        System.out.println("2 - Subtrair (-)");
        System.out.println("3 - Multiplicar (*)");
        System.out.println("4 - Dividir (/)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.println();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + somar(n1, n2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + subtrair(n1, n2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + multiplicar(n1, n2));
                break;
            case 4:
                Double resultadoDivisao = dividir(n1, n2);
                
                if (resultadoDivisao == null) {
                    System.out.println("Erro: Não é possível dividir por zero!");
                } else {
                    System.out.println("Resultado da Divisão: " + resultadoDivisao);
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static Double dividir(double n1, double n2) {
        if (n2 == 0) {
            return null; 
        }
        return n1 / n2;
    }
}
