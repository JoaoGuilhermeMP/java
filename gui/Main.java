package gui;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome ");
        JOptionPane.showMessageDialog(null, "Hello " +nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Você tem " +idade+ " anos.");
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        JOptionPane.showMessageDialog(null, "Você tem " +altura+ " centimetros.");
    }
}
