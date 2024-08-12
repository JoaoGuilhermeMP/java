package troca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que dia é sua reunião? ");
        dia = scanner.next();

        switch (dia) {
            case "Segunda": System.out.println("Sua reunião então está marcada para Segunda!");
            break;
            case "Terça": System.out.println("Sua reunião então está marcada para Terça!");
            break;
            case "Quarta": System.out.println("Sua reunião então está marcada para Quarta!");
            break;
            case "Quinta": System.out.println("Sua reunião então está marcada para Quinta!");
            break;
            case "Sexta": System.out.println("Sua reunião então está marcada para Sexta");
            break;
            default: System.out.println("Escolha um dia válido!!");
        }

        scanner.close();
    }
}
