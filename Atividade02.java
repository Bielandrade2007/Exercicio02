import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        String mensagem = "";

        if (media >= 0.0 && media < 3.0) {
            mensagem = "Reprovado";
        } else if (media >= 3.0 && media < 7.0) {
            mensagem = "Exame";
        } else if (media >= 7.0 && media <= 10.0) {
            mensagem = "Aprovado";
        }

        System.out.println("Média aritmética: " + media);
        System.out.println("Mensagem: " + mensagem);
    }
}
