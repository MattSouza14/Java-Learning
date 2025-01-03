import java.util.ArrayList;
public class Arraylist {
    //amplamente utilizado para armazenar e manipular uma coleção de elementos de forma dinâmica
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // adicionar elementos
        lista.add("A");
        lista.add("B");
        lista.add("C");

        //Acessar elementos
        System.out.println("Elemento na posição 1: " + lista.get(1));

        //Atualizar elemento
        lista.set(1, "X");
        System.out.println("Lista atualizada: " + lista);

        //Remover elemento
        lista.remove("A");
        System.out.println("Lista após remoção: " + lista);

        //Verificar tamanho
        System.out.println("Tamanho da lista: " + lista.size());

        //ordenar elementos
        lista.sort(String::compareTo);
        System.out.println("Lista ordenada: " + lista);
    }
}
