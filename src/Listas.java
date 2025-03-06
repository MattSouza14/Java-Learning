import java.util.ArrayList;
import java.util.List;

public class Listas {
    //Estruturas de dados ordenada do mesmo tipo, iniciada
    //vazia e seu elementos são alocados sob demanda != vetores
    //cada elemento ocupa um nodo da lista
    public static void main(String[] args) {
    //size() - tamanho da lista
    //add(obj), add(int, obj) - inserir elemento na lista
    //remove(obj), remove(int), removeIf(predicate) - remover elementos da lista
    //indexOf(obj), lasIndexOf(obj) - encontrar posição do elemento
    //List<Integer> result = list.stream().filter(x->x >4).collect(Collectors.toList());
        //filtar lista com base em predicado
        //Integer result = list.stream().filter(x->x>4).findFirst().orElse(null);
        //encontar primeeira ocorrencia com base em predicado
        // Operações Intermediárias (Transformam o Stream)
        // filter() → Filtra elementos com base em uma condição.
        // map() → Transforma elementos em outro formato.
        // sorted() → Ordena os elementos.
        //  Operações Terminais (Finalizam o Stream)
        // collect() → Converte o Stream em lista/conjunto/outro tipo.
        // findFirst() → Retorna o primeiro elemento correspondente.
        // count() → Conta os elementos filtrados.
        // forEach() → Percorre e executa uma ação em cada elemento.
        //Não aceita tipos primitivos
        List<Integer> listInt = new ArrayList<>();

        listInt.add(2);
        listInt.add(9);
        listInt.add(7);
        listInt.add(3);
        listInt.add(2, 5);
        System.out.println(listInt.size());
        for (Integer num: listInt){
            System.out.println(num);
        }
        listInt.remove(2);
        System.out.println("-------------------");
        for (Integer num: listInt){
            System.out.println(num);
        }
    }
}
