
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da lateral do triângulo:");
        double lateral1 = scanner.nextDouble();

        System.out.println("Digite o tamanho da próxima lateral do triângulo:");
        double lateral2 = scanner.nextDouble();

        System.out.println("Digite o tamanho da última lateral do triângulo:");
        double lateral3 = scanner.nextDouble();

        if ((lateral1 + lateral2) > lateral3 && (lateral1 + lateral3) > lateral2 && (lateral2 + lateral3) > lateral1) {
            System.out.println("Triâgulo válido.\nA soma dos dois lados é maior que o terceiro.");

            if (lateral1 == lateral2 && lateral1 == lateral3) {
            System.out.println("O triângulo é um triângulo Equilátero (três lados iguais).");
        } else if (lateral1 == lateral2 || lateral1 == lateral3 || lateral2 == lateral3) {
            System.out.println("O triângulo é um triângulo Isósceles (dois lados iguais).");
        } else {
            System.out.println("O triângulo é um triângulo Escaleno (todos os lados diferentes).");
        }

        } else {
            System.out.println("Triâgulo inválido.\nA soma dos dois lados não é maior que o terceiro.");
        }

        scanner.close();
        
    }
}
