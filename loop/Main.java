package loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        do {
            System.out.println("Enter your name: ");
            nome = scanner.next();
        } while (nome.isBlank());
        

        System.out.println("Hello "+nome);

        scanner.close();
    }
}
