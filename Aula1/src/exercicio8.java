import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha qual dos casos você se identifica");
        System.out.println("1 - Gestante        2 - Idoso       3 - PCD     4 - Nenhuma das opções");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: // Gestante
                System.out.println("Você tem direito a fila prioritaria");
                break;
            case 2: // Idoso
                System.out.println("Você tem direito a fila prioritaria");
                break;
            case 3: // PCD
                System.out.println("Você tem direito a fila prioritaria");
                break;
            default: // Nenhuma das opções
                System.out.println("Você não tem direito a fila prioritaria");
        }
        }
    }

