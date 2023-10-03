import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        int numeroGrande;
        int numeroPequeno;
        int media;

        // mostra texto e guarda os números escritos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha três números");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        // calcula a média dos números escolhidos
        media = (num1 + num2 + num3)/3;

        // mostra a média
        System.out.println("a média é: " + media);
        System.out.println();

        // mostra o maior número
        if (num1 > num2 && num1 > num3){
            System.out.println("o maior número é: " + num1);
        } else if (num2 > num3 && num2 > num1 ){
            System.out.println("o maior número é: " + num2);
        } else{
            System.out.println("o maior número é: " + num3);
        };

        // mostra o menor número
        if (num1 < num2 && num1 < num3){ // verifica se o numero 1 é menor que os outros
            System.out.println("o maior número é: " + num1);
        } else if (num2 < num3 && num2 < num1 ){ // verifica se o numero 2 é menor que os outros
            System.out.println("o maior número é: " + num2);
        } else{ // se nenhum deles forem menor, então esse é o menor
            System.out.println("o menor número é: " + num3);
        };
    }
}
