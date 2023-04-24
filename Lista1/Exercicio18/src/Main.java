import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Questao18 print = new Questao18();
        print.x = 10;

        JOptionPane.showMessageDialog(null, "Valor de X =  " + (print.x + 1));

    }
}