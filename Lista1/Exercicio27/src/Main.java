import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Quetao27 print =  new Quetao27();
        print.x = 2;
        print.y= 5;
        JOptionPane.showMessageDialog(null,"x"+print.x + "\n" +"Y:"+ print.y +"\n");
        print.y ++;
        print.x ++;
        JOptionPane.showMessageDialog(null,"Novo valor de x:"+print.x + "\n" +"Novo valor de Y:"+ print.y +"\n");
    }
}