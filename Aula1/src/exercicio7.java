import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeMinima = 18;
        int salarioMinimo = 2000;

        System.out.println("Quantos anos você tem e quanto é o seu salário?");
        idadeMinima = scanner.nextInt();
        salarioMinimo = scanner.nextInt();

        if (idadeMinima >=18 && salarioMinimo >= 2000){
            System.out.println("Você pode comprar um carro!");
        } else System.out.println("Você não pode comprar um carro!");
    }
}
