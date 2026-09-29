
import java.util.Scanner;

public class p1_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int atendimento = 0;
        int opcao;

        do { 
            System.out.println("\n=== SISTEMA DE ATENDIMENTO ===");
            System.out.println("1 - Cadastrar atendimento");
            System.out.println("2 - Consultar quantidade de atendimentos");
            System.out.println("3 - Encerrar");
            System.out.println("\nInsira o número da opção escolhida:");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\n=== CADASTRO DE ATENDIMENTO ===");
                System.out.println("Infome deu nome:");
                String nome = scanner.next();
                System.out.println("Informe sua idade:");
                int idade = scanner.nextInt();

                atendimento++;
            } else if (opcao == 2) {
                System.out.println("\n=== CONSULTA DE ATENDIMENTOS ===");
                System.out.println("Atendimentos realizados: " + atendimento);
            } else if (opcao == 3) {
                System.out.println("\n=== ENCERRAMENTO DO SISTEMA ===");
                System.out.println("Sistema encerrado. Até mais!");
            }
            else {
                System.out.println("Opção invalida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
