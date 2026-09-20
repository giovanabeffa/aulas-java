
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de avaliações:");
        int avaliacoes = scanner.nextInt();
        
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double notas = 0;
        int maisQueSeis = 0;

        for (int i = 1; i <= avaliacoes; i++) {
            System.out.println("Informe a nota:");
            double nota = scanner.nextDouble();

            notas += nota;

            if (nota > 6) {
                maisQueSeis++;
            }

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        scanner.close();

        double media = notas / avaliacoes;
        
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else if (media >= 4 && media < 6) {
            System.out.println("Exame.");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.printf("Média: %.1f%n", media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Avaliações acima de 6: " + maisQueSeis);
    }
}
