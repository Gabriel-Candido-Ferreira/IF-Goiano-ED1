public class Algoritmo473 {
    public static int maiuscula(String letra) {
        if (!letra.equals("A") && !letra.equals("a") && !letra.equals("E") && !letra.equals("e")
                && !letra.equals("I") && !letra.equals("i") && !letra.equals("O") && !letra.equals("o")
                && !letra.equals("U") && !letra.equals("u")) {
            return 1;
        } else {
            return 0;
        }
    }
}

