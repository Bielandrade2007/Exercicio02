import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double novoPreco;
        String classificacao;

        if (preco <= 50.00) {
            novoPreco = preco + (preco * 0.05);
        } else if (preco <= 100.00) {
            novoPreco = preco + (preco * 0.10);
        } else {
            novoPreco = preco + (preco * 0.15);
        }

        if (novoPreco <= 80.00) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.00) {
            classificacao = "Normal";
        } else if (novoPreco <= 200.00) {
            classificacao = "Caro";
        } else {
            classificacao = "Muito caro";
        }

        System.out.println("Novo Preço: R$ " + novoPreco);
        System.out.println("Classificação: " + classificacao);
    }
}
