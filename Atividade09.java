import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo médio do cliente no último ano: ");
        double saldoMedio = scanner.nextDouble();
        double valorCredito;

        if (saldoMedio > 400.00) {
            valorCredito = saldoMedio * 0.30;
        } else if (saldoMedio >= 300.00) {
            valorCredito = saldoMedio * 0.25;
        } else if (saldoMedio >= 200.00) {
            valorCredito = saldoMedio * 0.20;
        } else {
            valorCredito = saldoMedio * 0.10;
        }

        System.out.println("Saldo Médio: R$ " + saldoMedio);
        System.out.println("Valor do Crédito: R$ " + valorCredito);
    }
}
