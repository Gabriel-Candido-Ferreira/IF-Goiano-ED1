import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao44 calc = new Questao44();
        calc.numero = Double.parseDouble(JOptionPane.showInputDialog("Entre com o logaritmando"));
        calc.base = Double.parseDouble(JOptionPane.showInputDialog("Entre com a base"));
        calc.logaritmo= Math.log(calc.numero)/Math.log(calc.base);

        JOptionPane.showMessageDialog(null,"Logaritmo "+calc.numero+" na base "+calc.base+ " eh "+calc.logaritmo);


    }
}