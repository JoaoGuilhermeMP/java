import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String name = scanner.nextLine();
        System.out.println("Quantos anos você tem? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual sua comida preferida? ");
        String food = scanner.nextLine();

        System.out.println("Olá "+name);
        System.out.println("Você tem " +age+ " anos.");
        System.out.println("Sua comida preferida é "+food);

        scanner.close();

    }

}