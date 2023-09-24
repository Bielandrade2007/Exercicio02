import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de investimento (1 para Poupança, 2 para Fundos de renda fixa): ");
        int tipoInvestimento = scanner.nextInt();

        System.out.println("Digite o valor do investimento: ");
        double valorInvestimento = scanner.nextDouble();
        double valorCorrigido;

        if (tipoInvestimento == 1) {
            valorCorrigido = valorInvestimento + (valorInvestimento * 0.03);
        } else if (tipoInvestimento == 2) {
            valorCorrigido = valorInvestimento + (valorInvestimento * 0.04);
        } else {
            System.out.println("Tipo de investimento inválido.");
            return;
        }

        System.out.println("Valor corrigido após um mês de investimento: R$ " + valorCorrigido);
    }
}
