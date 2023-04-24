import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Quetao25 print = new Quetao25();
        print.data = Integer.parseInt(JOptionPane.showInputDialog("Digite data no formato dd/mm/aa"));

        print.dia = print.data/10000;
        print.mes = (print.data % 10000)/100;
        print.ano = print.data % 100;


        JOptionPane.showMessageDialog(null, "Dia:" + print.dia +"\n"+ "Mes:" + print.mes +"\n"+ "Ano:"+ print.ano);

    }
}