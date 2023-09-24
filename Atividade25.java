import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        System.out.println("Digite o número de horas que o funcionário faltou ao trabalho: ");
        int horasFalta = scanner.nextInt();

        int minutos = horasExtras - (2 * horasFalta / 3);
        double premio;

        if (minutos >= 2400) {
            premio = 500.00;
        } else if (minutos >= 1800) {
            premio = 400.00;
        } else if (minutos >= 1200) {
            premio = 300.00;
        } else if (minutos >= 600) {
            premio = 200.00;
        } else {
            premio = 100.00;
        }

        System.out.println("Prêmio de Natal: R$ " + premio);
    }
}
