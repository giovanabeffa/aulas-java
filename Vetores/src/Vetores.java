
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        // String nome;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um nome a ser inserido no vetor: ");
            nomes[i] = scanner.next();
            // nome = scanner.next();
            // nomes[i] = nome;
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("O nome da posição " + (i+1) + " é: " + nomes[i]);
        }

        // int[] numeros = new int[20];
        // int num = 0;

        // for ( int i = 0; i < 20; i++) {
        //     System.out.println("Informe um número a ser inserido no vetor:");
        //     num = scanner.nextInt();
        //     numeros[i] = num;
        // }

        // int resultado = 0;

        // resultado = numeros[3];
        // System.out.println("O valor da posição 3 é: " + resultado);
        // System.out.println("O valor da posição 3 é: " + numeros[3]);

        // for(int i = 0; i <20; i++) {
        //     resultado = numeros[i];
        //     System.out.println("O valor da posição " + i+1 + " é: " + resultado);
        // }
    }
}
