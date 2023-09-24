import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a categoria (1 - Limpeza, 2 - Alimentação, 3 - Vestuário): ");
        int categoria = scanner.nextInt();

        System.out.println("Digite a situação (R - Refrigerado, N - Não Refrigerado): ");
        char situacao = scanner.next().charAt(0);

        double aumento;
        double imposto;
        double novoPreco;
        String classificacao;

        if (preco <= 25.00) {
            aumento = calcularAumento(categoria, preco, 5);
        } else {
            aumento = calcularAumento(categoria, preco, 12);
        }

        if ((categoria == 2 && situacao == 'R') || preco > 120.00) {
            imposto = preco * 0.05;
        } else {
            imposto = preco * 0.08;
        }

        novoPreco = preco + aumento - imposto;

        if (novoPreco <= 50.00) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.00) {
            classificacao = "Normal";
        } else {
            classificacao = "Caro";
        }

        System.out.println("Valor do Aumento: R$ " + aumento);
        System.out.println("Valor do Imposto: R$ " + imposto);
        System.out.println("Novo Preço: R$ " + novoPreco);
        System.out.println("Classificação: " + classificacao);
    }

    public static double calcularAumento(int categoria, double preco, double percentual) {
        switch (categoria) {
            case 1:
                return preco * (percentual / 100);
            case 2:
                return preco * (percentual / 100);
            case 3:
                return preco * (percentual / 100);
            default:
                return 0;
        }
    }
}
