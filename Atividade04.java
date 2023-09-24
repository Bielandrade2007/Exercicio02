import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maiorNumero;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maiorNumero = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maiorNumero = numero2;
        } else {
            maiorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);
    }
}