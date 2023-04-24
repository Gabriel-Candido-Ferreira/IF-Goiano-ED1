public class Main {

    public static void main(String[] args) {


        Pilha pilha = new Pilha("UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE", " ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG");

        String[] palavras = pilha.getExemplo1().split(" ");
        String[] palavras2 = pilha.getExemplo2().split(" ");
        System.out.println("Frase de entrada: "+ pilha.getExemplo1());
        System.out.println("\n  Frase de final: ");
        System.out.println(pilha.inverteString(palavras));
        System.out.println("\n Frase de entrada: "+ pilha.getExemplo2());
        System.out.println("\n  Frase de final: ");
        System.out.println( pilha.inverteString(palavras2));
    }
}
