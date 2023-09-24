import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
}
