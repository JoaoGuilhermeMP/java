package arrays;

public class Main1 {
    public static void main(String[] args) {
        
        String [][] carros = new String[3][3];

        carros[0][0] = "BMW";
        carros[0][1] = "Porsche";
        carros[0][2] = "Gol Bolinha";
        carros[1][0] = "Kwid";
        carros[1][1] = "Mobi";
        carros[1][2] = "Audi";
        carros[2][0] = "Mustang";
        carros[2][1] = "Supra";
        carros[2][2] = "Fastback";

        for (int i = 0; i < carros.length; i++) {
            System.out.println();
            for (int j = 0; j < carros[i].length; j++) {
                System.out.print(carros[i][j] + " ");
            }
        }

    }
}
