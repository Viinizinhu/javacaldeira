import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Escolha um número");
        num1 = scanner.nextInt();
        System.out.println(("Escolha outro número"));
        num2 = scanner.nextInt();

        System.out.println("Você escolheu os números " + num1 + " e " + num2);
    }
}
