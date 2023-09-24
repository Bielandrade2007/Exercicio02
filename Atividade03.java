import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double menorNumero;

        if (numero1 < numero2) {
            menorNumero = numero1;
        } else {
            menorNumero = numero2;
        }

        System.out.println("O menor número é: " + menorNumero);
    }
}