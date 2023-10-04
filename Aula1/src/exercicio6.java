import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Você não pode votar");
        } else if (idade >= 16){
            System.out.println("Se você quiser, você pode votar");
        } else if(idade >= 18){
            System.out.println("Você é obrigado a votar!");
        } else if (idade >= 65){
            System.out.println("Se você quiser, você pode votar");
        }
    }
}
