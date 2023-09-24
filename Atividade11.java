import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        double aumento;
        double novoSalario;

        if (salarioAtual <= 300.00) {
            aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 600.00) {
            aumento = salarioAtual * 0.10;
        } else if (salarioAtual <= 900.00) {
            aumento = salarioAtual * 0.05;
        } else {
            aumento = 0.0;
        }

        novoSalario = salarioAtual + aumento;

        System.out.println("Valor do Aumento: R$ " + aumento);
        System.out.println("Novo Salário: R$ " + novoSalario);
    }
}
