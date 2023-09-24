import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o preço atual do produto: ");
        double preco = scanner.nextDouble();
        double desconto = 0.0;
        double novoPreco;

        if (preco <= 30.00) {
            desconto = 0.0;
        } else if (preco <= 100.00) {
            desconto = preco * 0.10;
        } else {
            desconto = preco * 0.15;
        }

        novoPreco = preco - desconto;

        System.out.println("Código do Produto: " + codigo);
        System.out.println("Valor do Desconto: R$ " + desconto);
        System.out.println("Novo Preço: R$ " + novoPreco);
    }
}
