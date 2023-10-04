import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int salarioDoUsuario;
        int salarioMinimo = 1320;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dinheiros você ganha?");
        salarioDoUsuario = scanner.nextInt();

        if (salarioDoUsuario >= 1320) {
            int quantidadeDeSalario = salarioDoUsuario / salarioMinimo;
            System.out.println("Você tem aproximadamente " + quantidadeDeSalario + " salarios minimos");
        } else {
            System.out.println("Você ganha menos que um salário mínimo!");
        }
        ;
    }
}
