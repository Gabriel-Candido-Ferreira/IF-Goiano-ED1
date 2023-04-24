import java.util.LinkedList;

public class Pilha {
    private LinkedList<Object> elementos;

    public Pilha() {
        elementos = new LinkedList<Object>();
    }

    public void empilha(Object elemento) {
        elementos.add(elemento);
    }

    public Object desempilha() {
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.size() == 0;
    }
}
