import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Qual o seu nome?");
        nome = scanner.nextLine();
        System.out.println("Bom dia " + nome);
    }
}
