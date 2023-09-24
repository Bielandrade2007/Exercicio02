import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        int grupoRisco;

        if (idade < 20) {
            if (peso <= 60) {
                grupoRisco = 9;
            } else if (peso <= 90) {
                grupoRisco = 8;
            } else {
                grupoRisco = 7;
            }
        } else if (idade <= 50) {
            if (peso <= 60) {
                grupoRisco = 6;
            } else if (peso <= 90) {
                grupoRisco = 5;
            } else {
                grupoRisco = 4;
            }
        } else {
            if (peso <= 60) {
                grupoRisco = 3;
            } else if (peso <= 90) {
                grupoRisco = 2;
            } else {
                grupoRisco = 1;
            }
        }

        System.out.println("Grupo de Risco: " + grupoRisco);
    }
}
