import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Questao12 print = new Questao12();
        print.primeiraMsg = "Aprendendo Algontmo!!!";
        print.segundaMsg = "Com Anita e Guto";

        JOptionPane.showMessageDialog(null, print.primeiraMsg + print.segundaMsg);
    }
}