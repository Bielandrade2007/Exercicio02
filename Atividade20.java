import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        String categoria;

        if (idade < 5) {
            System.out.println("Idade insuficiente para categorização.");
            return;
        } else if (idade >= 5 && idade <= 7) {
            categoria = "Infantil";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Juvenil";
        } else if (idade >= 11 && idade <= 15) {
            categoria = "Adolescente";
        } else if (idade >= 16 && idade <= 30) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }

        System.out.println("Categoria: " + categoria);
    }
}