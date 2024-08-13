package loop;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas;
        int colunas;
        String simbolo = "";

        System.out.println("Escolha a quantidade de linhas: ");
        linhas = scanner.nextInt();
        System.out.println("Escolha a quantidade de colunas: ");
        colunas = scanner.nextInt();
        System.out.println("Escolha um simbolo: ");
        simbolo = scanner.next();

        for(int i=1; i <= linhas; i++) {
            System.out.println();
            for(int j = 1; j <=colunas; j++){
                System.out.print(simbolo);
            }
        }

        scanner.close();
    }
}
