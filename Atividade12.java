import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();
        double imposto = salarioBruto * 0.07;
        double gratificacao = 0.0;

        if (salarioBruto <= 350.00) {
            gratificacao = 100.00;
        } else if (salarioBruto <= 600.00) {
            gratificacao = 75.00;
        } else if (salarioBruto <= 900.00) {
            gratificacao = 50.00;
        } else {
            gratificacao = 35.00;
        }

        double valorReceber = salarioBruto + gratificacao - imposto;

        System.out.println("Valor a Receber: R$ " + valorReceber);
    }
}
