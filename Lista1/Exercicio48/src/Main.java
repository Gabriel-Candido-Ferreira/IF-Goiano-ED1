import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Questao48 calc = new Questao48();
        calc.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario minimo:"));
        calc.quantidade = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em quilowatt:"));
        calc.preco = calc.salario/700;
        calc.valorPagar = calc.preco* calc.quantidade;
        calc.valorDescontado = calc.valorPagar*0.9;
        JOptionPane.showMessageDialog(null, "Preço do quilowatt: "+ calc.preco+"\n valor a ser pago "+calc.valorPagar + " \n valor a der descontado: "+ calc.valorDescontado);




    }
}