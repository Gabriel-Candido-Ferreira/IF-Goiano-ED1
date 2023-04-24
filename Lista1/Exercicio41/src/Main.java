import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao41 calc = new Questao41();
        calc.a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao valor de A"));
        calc.b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao valor de B"));
        calc.c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao valor de C"));
        calc.d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao valor de D"));

        calc.media = (calc.a*1 + calc.b*2 + calc.c*3 + calc.d*4)/10;

        JOptionPane.showMessageDialog(null,"A media ponderada:" + calc.media);

    }
}