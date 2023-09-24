import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = scanner.nextInt();

        if (senha == 4531) {
            System.out.println("Permissão de acesso concedida.");
        } else {
            System.out.println("Permissão de acesso negada.");
        }
    }
}
