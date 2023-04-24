import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao43 calc = new Questao43();
        calc.numero = Double.parseDouble(JOptionPane.showInputDialog("Entre com o logaritmando"));
        calc.logaritmo= Math.log(calc.numero)/Math.log(10);
        JOptionPane.showMessageDialog(null, "logaritmo:"+calc.logaritmo);
    }
}