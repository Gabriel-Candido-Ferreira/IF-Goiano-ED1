import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao40 calc = new Questao40();
        calc.dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao dividendo"));
        calc.divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor referente ao divisor"));

        calc.quociente = calc.dividendo/calc.divisor;
        calc.resto = calc.dividendo% calc.divisor;

        JOptionPane.showMessageDialog(null, "Dividendo:"+calc.dividendo+"\n"+"Divisor:"+calc.divisor);
        JOptionPane.showMessageDialog(null,"Quociente:"+calc.quociente+"\n"+"Resto:"+calc.resto);
    }
}