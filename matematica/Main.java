package matematica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o valor de x: ");
        x = scanner.nextDouble();
        System.out.println("Escolha o valor de y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("A hipotenusa de seu triangulo é: " +z);

        scanner.close();

    }
}
