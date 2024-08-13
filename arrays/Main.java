package arrays;

public class Main {
    public static void main(String[] args) {
        String[] carros = new String[3];

        carros[0] = "Porsche";
        carros[1] = "BMW";
        carros[2] = "Audi";

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
    }
}
