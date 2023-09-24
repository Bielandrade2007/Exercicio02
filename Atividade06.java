import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("a) O primeiro número elevado ao segundo número");
        System.out.println("b) Raiz quadrada de cada um dos números");
        System.out.println("c) Raiz cúbica de cada um dos números");

        char escolha = scanner.next().charAt(0);

        double resultado;

        switch (escolha) {
            case 'a':
                resultado = Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 'b':
                double raiz1 = Math.sqrt(numero1);
                double raiz2 = Math.sqrt(numero2);
                System.out.println("Raiz quadrada do primeiro número: " + raiz1);
                System.out.println("Raiz quadrada do segundo número: " + raiz2);
                break;
            case 'c':
                double cubo1 = Math.cbrt(numero1);
                double cubo2 = Math.cbrt(numero2);
                System.out.println("Raiz cúbica do primeiro número: " + cubo1);
                System.out.println("Raiz cúbica do segundo número: " + cubo2);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}