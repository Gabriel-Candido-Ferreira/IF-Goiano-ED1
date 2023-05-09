import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();

        // 1- Adicione Homer e Marge a lista e imprima o resultado
        System.out.println("1- ");
        lista.add("Homer");
        lista.add("Marge");
        System.out.println(lista);

        // 2- Esvaize a lista, e depois imprima o resultado
        System.out.println(" ");
        System.out.println("2- ");
        lista.clear();
        System.out.println(lista);

        // 3- Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        System.out.println(" ");
        System.out.println("3- ");
        lista.add("Homer");
        lista.add(0, "Bart");
        lista.add(1, "Moll");
        System.out.println(lista);

        // 4- Esvazie a lista
        System.out.println(" ");
        System.out.println("4- ");
        lista.clear();
        System.out.println(lista);

        // 5- Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        System.out.println(" ");
        System.out.println("5- ");
        lista.add("Homer");
        lista.add("Bart");
        lista.addFirst("Lisa");
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 6- Esvazie a lista e imprima
        System.out.println(" ");
        System.out.println("6- ");
        lista.clear();
        System.out.println(lista);

        // 7- Adicione Homer, Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        System.out.println(" ");
        System.out.println("7- ");
        lista.add("Homer");
        lista.add("Maggie");
        lista.add(0, "Bart");
        lista.add(1, "Marge");
        System.out.println(lista);
        System.out.println("Lisa está na lista? " + lista.contains("Lisa"));

        // 8- Esvazie a lista
        System.out.println(" ");
        System.out.println("8- ");
        lista.clear();
        System.out.println(lista);

        // 9- Adicione Homer e Bart na lista depois imprima o resultado e o lamanho da lista 
        System.out.println(" ");
        System.out.println("9- ");
        lista.add("Homer");
        lista.add("Bart");
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 10- Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(" ");
        System.out.println("10- ");
        System.out.println("Marge está na lista? " + lista.contains("Marge"));
        System.out.println("Homer está na lista? " + lista.contains("Homer"));
        System.out.println("Bart está na lista? " + lista.contains("Bart"));
        System.out.println("Maggie está na lista? " + lista.contains("Maggie"));
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 11- esvazie a lista
        System.out.println("11- ");
        lista.clear();
        System.out.println(lista);

        // 12- Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
        System.out.println(" ");
        System.out.println("12- ");
        lista.add(0, "Homer");
        lista.add(1, "Bart");
        lista.add(2, "Marge");
        lista.add(1, "Maggie");
        lista.add(0, "Ned Flanders");
        lista.add("Sr. Burns");
        System.out.println(lista);

        // 13- Remova do fim da lista e imprima a lista
        System.out.println(" ");
        System.out.println("13- ");
        lista.remove(lista.size() - 1);
        System.out.println(lista);

        // 14- Remova a posição 1, depois imprima a lista e o tamanho da lista
        System.out.println(" ");
        System.out.println("14- ");
        lista.remove(1);
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 15- Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(" ");
        System.out.println("15- ");
        System.out.println("Marge está na lista? " + lista.contains("Marge"));
        System.out.println("Homer está na lista? " + lista.contains("Homer"));
        System.out.println("Bart está na lista? " + lista.contains("Bart"));
        System.out.println("Maggie está na lista? " + lista.contains("Maggie"));
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 16- Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        System.out.println(" ");
        System.out.println("16- ");
        lista.remove(0);
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 17- Verifique se Marge, Homer, Bart e Maggie na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(" ");
        System.out.println("17- ");
        System.out.println("Marge está na lista? " + lista.contains("Marge"));
        System.out.println("Homer está na lista? " + lista.contains("Homer"));
        System.out.println("Bart está na lista? " + lista.contains("Bart"));
        System.out.println("Maggie está na lista? " + lista.contains("Maggie"));
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        // 18- esvazie a lista e imprima a lista
        System.out.println(" ");
        System.out.println("18- ");
        lista.clear();
        System.out.println(lista);
    }
}
