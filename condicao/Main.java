package condicao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem? ");
        idade = scanner.nextInt();

        if (idade >= 18 && idade < 21) {
            System.out.println("Você pode tirar a carteira de motorista dos tipos A e B mas terá que esperar para tirar a C!");
        }
        else if (idade >= 21) {
            System.out.println("Você já pode tirar a carteira de motorista do tipo C!");
        }
        else{
            System.out.println("Você não pode tirar a carteira de motorista!");
        }

        scanner.close();
    }
}
