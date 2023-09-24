import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        double salarioReajustado;

        if (salario <= 300.00) {
            salarioReajustado = salario + (salario * 0.35);
        } else {
            salarioReajustado = salario + (salario * 0.15);
        }

        System.out.println("Salário reajustado: R$ " + salarioReajustado);
    }
}
