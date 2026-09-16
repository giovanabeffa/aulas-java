
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }

        int contador = 10;

        while (contador >= 1) {
            System.out.println("Número: " + contador);
            contador--;
        }

        System.out.println("Informe um número:");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }

        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe um numero:");
            soma += numero = sc.nextInt();
        }
        int media = soma/5;
        System.out.println("A média dos números informador é : " + media);
        System.out.println("A soma dos números informafos é: " + soma);
    }

    
}
