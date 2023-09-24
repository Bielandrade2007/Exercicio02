import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                double media = (numero1 + numero2) / 2;
                System.out.println("A média entre os números digitados é: " + media);
                break;
            case 2:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("A diferença entre o maior e o menor número é: " + diferenca);
                break;
            case 3:
                double produto = numero1 * numero2;
                System.out.println("O produto entre os números digitados é: " + produto);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("A divisão do primeiro pelo segundo número é: " + divisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
