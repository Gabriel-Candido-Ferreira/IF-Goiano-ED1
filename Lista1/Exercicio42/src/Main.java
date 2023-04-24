import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao42 calc = new Questao42();
        calc.angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite um angulo em graus"));

        calc.rang = (calc.angulo * 3.14)/180;

        JOptionPane.showMessageDialog(null, "Seno:"+ Math.sin(calc.rang) + "\n");
        JOptionPane.showMessageDialog(null, "Co-seno:"+ Math.cos(calc.rang)+ "\n");
        JOptionPane.showMessageDialog(null, "Tangente:"+ Math.tan(calc.rang)+ "\n");
        JOptionPane.showMessageDialog(null, "Co-secante:"+ 1/(Math.sin(calc.rang))+ "\n");
        JOptionPane.showMessageDialog(null, "Secante:"+ 1/(Math.cos(calc.rang))+ "\n");
        JOptionPane.showMessageDialog(null, "Cotangente:"+ 1/(Math.tan(calc.rang))+ "\n");



    }
}