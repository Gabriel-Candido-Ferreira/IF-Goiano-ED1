import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Quetao26 print =  new Quetao26();
        print.data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato DDMMAA:"));

        print.dia = print.data/10000;
        print.mes = (print.data % 10000)/100;
        print.ano = print.data % 100;
        print.ndata = print.mes *10000+ print.dia*100+ print.ano;

        JOptionPane.showMessageDialog(null, "Dia:"+print.dia+"\n"+"Mes:"+print.mes+"\n"+"Ano:"+print.ano+"\n"+"Data no formato MMDDAA:"+print.ndata);

    }
}