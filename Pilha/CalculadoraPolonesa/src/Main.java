import java.util.*;


public class Main {
    private static String prefixa, infixa, posfixa, expressao;
    private static double resultado;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Fale a expressão: ");

        expressao = sc.nextLine().trim();

        System.out.print("\nA expressão é\n1 - Posfixa\n2 - Infixa\n3 - Prefixa\n  R:");

        String tipoDaExpressao = sc.nextLine();

        if (Objects.equals(tipoDaExpressao, "1")) {
            converterPosfixa();
        }
        if (Objects.equals(tipoDaExpressao, "2")) {
            converterInfixa();
        }
        if (Objects.equals(tipoDaExpressao, "3")) {
            converterPrefixa();
        }

        if (!Objects.equals(tipoDaExpressao, "1") && !Objects.equals(tipoDaExpressao, "2") && !Objects.equals(tipoDaExpressao, "3")) {
            System.out.println("Progama vai ser encerrado, pois a opção é incorreta");
            System.exit(0);
        }
        calcularPosfixa();

        System.out.println("\nPosfixa = " + posfixa + "\nInfixa = " + infixa + "\nPrefixa = " + prefixa + "\n\nResultado = " + resultado);

    }

    private static void converterPosfixa() {
        posfixa = expressao;
        posfixaParaInfixa();
        infixaParaPrefixa();

    }

    private static void converterInfixa() {
        infixa = expressao;
        infixaParaPrefixa();
        infixaParaPosfixa();

    }

    private static void converterPrefixa() {
        prefixa = expressao;
        prefixaParaInfixa();
        infixaParaPosfixa();
    }


    private static void infixaParaPosfixa() {

        String[] elementos = infixa.split(" ");

        Stack<String> pilha = new Stack<>();
        List<String> saida = new ArrayList<>();
        for (String elemento : elementos) {
            if (isOperador(elemento)) {
                while (!pilha.isEmpty() && prioridade(pilha.peek()) >= prioridade(elemento)) {
                    saida.add(pilha.pop());
                }
                pilha.push(elemento);
            } else if (elemento.equals(")")) {
                while (!pilha.peek().equals("(")) {
                    saida.add(pilha.pop());
                }
                pilha.pop();
            } else if (elemento.equals("(")) {
                pilha.push(elemento);
            } else {
                saida.add(elemento);
            }
        }
        while (!pilha.isEmpty()) {
            saida.add(pilha.pop());
        }
        posfixa = String.join(" ", saida).trim();
    }

    private static void infixaParaPrefixa() {
        String[] elementos = infixa.split(" ");
        Stack<String> pilha = new Stack<>();
        List<String> saida = new ArrayList<>();


        for (int i = elementos.length - 1; i >= 0; i--) {
            String elemento = elementos[i];
            if (isOperando(elemento)) {
                saida.add(elemento);
            } else if (elemento.equals(")")) {
                pilha.push(elemento);
            } else if (isOperador(elemento)) {
                while (!pilha.isEmpty() && prioridade(pilha.peek()) > prioridade(elemento)) {
                    saida.add(pilha.pop());
                }
                pilha.push(elemento);
            } else if (elemento.equals("(")) {
                while (!pilha.peek().equals(")")) {
                    saida.add(pilha.pop());
                }
                pilha.pop();
            }
        }

        while (!pilha.isEmpty()) {
            saida.add(pilha.pop());
        }

        Collections.reverse(saida);
        prefixa = String.join(" ", saida).trim();
    }

    public static void prefixaParaInfixa() {
        Stack<String> pilha = new Stack<>();
        String[] elementos = prefixa.split(" ");

        for (int i = elementos.length - 1; i >= 0; i--) {
            String elemento = elementos[i];

            if (isOperador(elemento)) {
                String operando1 = pilha.pop();
                String operando2 = pilha.pop();
                String expressaoResultante = "(" + operando1 + " " + elemento + " " + operando2 + ")";
                pilha.push(expressaoResultante);
            } else {
                pilha.push(elemento);
            }
        }
        infixa = pilha.pop();
    }

    public static void posfixaParaInfixa() {
        String[] elementos = posfixa.split(" ");
        Stack<String> pilha = new Stack<>();
        for (String elemento : elementos) {
            if (isOperando(elemento)) {
                pilha.push(elemento);
            } else if (isOperador(elemento)) {
                String operando2 = pilha.pop();
                String operando1 = pilha.pop();
                String expressaoResultante = "(" + operando1 + " " + elemento + " " + operando2 + ")";
                pilha.push(expressaoResultante);
            }
        }
        infixa = pilha.pop();
    }


    private static boolean isOperando(String elemento) {
        try {
            Double.parseDouble(elemento);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static boolean isOperador(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^");
    }

    private static int prioridade(String operador) {
        if (operador.equals("+") || operador.equals("-")) {
            return 1;
        } else if (operador.equals("*") || operador.equals("/")) {
            return 2;
        } else if (operador.equals("^")) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void calcularPosfixa() {
        String[] elementos = posfixa.split(" ");
        Stack<Double> pilha = new Stack<>();

        for (String elemento : elementos) {
            if (isOperando(elemento)) {
                pilha.push(Double.parseDouble(elemento));
            } else if (isOperador(elemento)) {
                double operando2 = pilha.pop();
                double operando1 = pilha.pop();

                if (elemento.equals("+")) {
                    pilha.push(operando1 + operando2);
                } else if (elemento.equals("-")) {
                    pilha.push(operando1 - operando2);
                } else if (elemento.equals("*")) {
                    pilha.push(operando1 * operando2);
                } else if (elemento.equals("/")) {
                    pilha.push(operando1 / operando2);
                } else if (elemento.equals("^")) {
                    pilha.push(Math.pow(operando1, operando2));
                }
            }
        }

        resultado = pilha.pop();
    }

}

