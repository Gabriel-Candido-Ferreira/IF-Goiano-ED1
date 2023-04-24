import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao46 calc = new Questao46();
        calc.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Saldo:"));
        calc.nSaldo = calc.saldo *1.01;
        JOptionPane.showMessageDialog(null, "O novo saldo eh: "+ calc.nSaldo);

    }
}