import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        double novoSalario;

        if (salario <= 300.00) {
            novoSalario = salario + (salario * 0.50);
        } else if (salario <= 500.00) {
            novoSalario = salario + (salario * 0.40);
        } else if (salario <= 700.00) {
            novoSalario = salario + (salario * 0.30);
        } else if (salario <= 800.00) {
            novoSalario = salario + (salario * 0.20);
        } else if (salario <= 1000.00) {
            novoSalario = salario + (salario * 0.10);
        } else {
            novoSalario = salario + (salario * 0.05);
        }

        System.out.println("Novo Salário: R$ " + novoSalario);
    }
}
