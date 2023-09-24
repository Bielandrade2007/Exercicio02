import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 40): ");
        int codigoProduto = scanner.nextInt();

        System.out.println("Digite a quantidade comprada do produto: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        double precoTotal;
        double desconto;
        double precoFinal;

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido.");
            return;
        }

        precoTotal = precoUnitario * quantidade;

        if (precoTotal <= 250.00) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal <= 500.00) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        precoFinal = precoTotal - desconto;

        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Preço Total da Nota: R$ " + precoTotal);
        System.out.println("Valor do Desconto: R$ " + desconto);
        System.out.println("Preço Final da Nota: R$ " + precoFinal);
    }
}