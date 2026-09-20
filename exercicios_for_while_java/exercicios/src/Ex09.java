
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacidadeMax = 50;
        double combustivelTanque = 0;

        System.out.println("Insira a quantidade de combustível disponível no tanque:");
        combustivelTanque = scanner.nextDouble();

        while (combustivelTanque > capacidadeMax || combustivelTanque <= 0) {
            System.out.printf("Quantidade inválida! A capacidade máxima do tanque é %.2f litros e a quantidade deve ser maior que 0. Tente novamente.%n", capacidadeMax);
            combustivelTanque = scanner.nextDouble();
        }

        int opcao = 0;

        do {
            System.out.println("\nEscolha a opção:");
            System.out.println("1 - Abastecer");
            System.out.println("2 - Consumir combustível");
            System.out.println("3 - Consultar tanque");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\nInsira a quantidade de litros para o abastecimento:");
                double abastecimento = scanner.nextDouble();

                if (abastecimento <= 0) {
                    System.out.println("\nQuantidade inválida. Tente novamente.");
                } else if (combustivelTanque + abastecimento > capacidadeMax) {
                    System.out.println("\nCapacidade máxima do tanque excedida. Tente novamente.");
                } else {
                    combustivelTanque += abastecimento;
                    System.out.printf("\nAbastecimento de %.2f litros realizado. Quantidade atual de combustível no tanque: %.2f litros.%n", abastecimento, combustivelTanque);
                }
            } else if (opcao == 2) {
                System.out.println("\nDigite a quandidade litros de combustível para consumir:");
                double consumir = scanner.nextDouble();

                if (consumir <= 0) {
                    System.out.println("\nValor inválido. Tente novamente.");
                } else if (consumir > combustivelTanque) {
                    System.out.printf("\nValor inválido. A quantidade excede o nível de %.2f litros de combustível disponível no tanque.%n", combustivelTanque);
                } else {
                    combustivelTanque -= consumir;
                    System.out.printf("\n%.2f litros de combustível consumidos. Quantidade de combustível disponível no tanque: %.2f litros.%n", consumir, combustivelTanque);
                }
            } else if (opcao == 3) {
                System.out.printf("\nQuantidade de combustível disponível no tanque: %.2f litros.%n", combustivelTanque);
            } else if (opcao == 0) {
                System.out.println("\nSistema encerrado.");
            } else {
                System.out.println("\nOpção inexistente. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
