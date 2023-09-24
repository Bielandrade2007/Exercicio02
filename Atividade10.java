import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        double precoConsumidor;

        if (custoFabrica <= 12000.00) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.05);
        } else if (custoFabrica <= 25000.00) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.10) + (custoFabrica * 0.15);
        } else {
            precoConsumidor = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.20);
        }

        System.out.println("Preço ao Consumidor: R$ " + precoConsumidor);
    }
}
