import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;

        System.out.println("Que horas são?");
        horas = scanner.nextInt();

        System.out.println("E quantos minutos?");
        minutos = scanner.nextInt();

        System.out.println("E os segundos atuais?");
        segundos = scanner.nextInt();

        segundos = (horas*3600 + minutos*60) + segundos;
        System.out.println("Faltam " + (86400-segundos) + " segundos para meia-noite");
    }
}
