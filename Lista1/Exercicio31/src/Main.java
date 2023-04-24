import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao31 med = new Questao31();

        med.media = (8+9+7)/3;

        JOptionPane.showMessageDialog(null, "A media eh:" + med.media + "\n");

    }
}