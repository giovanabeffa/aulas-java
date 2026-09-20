
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 9876;
        int tentativas = 1;
        int senha;

        while (tentativas <= 3) {
            System.out.println("Digite a senha:");
            senha = scanner.nextInt();
            tentativas++;

            if (senha == senhaCorreta) {
                System.out.println("Acesso autorizado!");
                scanner.close();
                return;
            } else {
                if (tentativas <= 3) {
                    System.out.println("A senha digitada está incorreta. Tente novamente.");
                }
            }
        }

        scanner.close();

        System.out.println("Número máximo de tentativas atingido. Acesso bloqueado!");       
    }
}
