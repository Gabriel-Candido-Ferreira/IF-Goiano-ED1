import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome[] = new String[5];
        double nota1[] = new double[5];
        double nota2[] = new double[5];
        double media[] = new double[5];
        String situaçao[] = new String[5];
        for(int i =0; i<nome.length;i++){
            System.out.println("digite o nome do aluno");
            String aluno = scan.nextLine();
            nome[i]= aluno;
        }
        for(int i=0; i< nome.length;i++){
            System.out.println("digite a nota 1 do(a) " + nome[i]);
            double nota_1 = scan.nextDouble();
            nota1[i]= nota_1;
            System.out.println("digite a nota 2 do(a) " + nome[i]);
            double nota_2 = scan.nextDouble();
            nota2[i]= nota_2;
            media[i] = ((nota1[i] + nota2[i])/2);
            situaçao[i] = "reprovado";
            if(media[i]>=6){
                situaçao[i] = "aprovado";
            }

        }
        for(int i=0; i< nome.length;i++){
            System.out.println("a media do aluno: " + nome[i] + " é " + media[i] + " o aluno está " + situaçao[i]);
        }
        scan.close();

    }
}