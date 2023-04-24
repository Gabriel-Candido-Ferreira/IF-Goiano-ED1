import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Questao23 print= new Questao23();
        print.numeroDeEntrada = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de 3 casas:"));
        print.resultado = (print.numeroDeEntrada % 100 ) / 10;

        JOptionPane.showMessageDialog(null, "Algarismo da casa das dezenas: "+ print.resultado + "\n");
    }
}