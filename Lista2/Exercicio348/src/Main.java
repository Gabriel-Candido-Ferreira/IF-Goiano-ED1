import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int l;
        String n;
        String nomes[] = new String[5];
        double prl[] = new double[5];
        double pr2[] = new double[5];
        double media[] = new double[5];

        Scanner scann = new Scanner(System.in);


        for (l = 0;l <= 4;l++){
            nomes[l] = JOptionPane.showInputDialog("digite o nome do aluno  \n");
            prl[l] = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 1 \n"));
            pr2[l] = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 2 \n"));
            media[l]= (prl[l]+pr2[l])/2;
            JOptionPane.showMessageDialog(null, nomes[l] + media[l]);
        }



    }
}