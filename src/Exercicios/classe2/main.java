package Exercicios.classe2;

import Exercicios.ListaExercicios.Main;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cachorro dogpool = new Cachorro("Dog da quebrada", 10);
        Gato gatinho = new Gato("Gatinho da quebrada", 15);
        Gato gato2 = new Gato("Gato da quebrada", 20);
        Cachorro dog2 = new Cachorro("Dog da quebrada", 15);
        Cachorro dog3 = new Cachorro("Gato da quebradinha", 18);
        dogpool.FazerSom();
        gatinho.FazerSom();

        ArrayList<String> animais = new ArrayList<>();
        animais.add(dogpool.toString());
        animais.add(gatinho.toString());
        animais.add(gato2.toString());
        animais.add(dog2.toString());
        animais.add(dog3.toString());

        for (int i = 0; i < animais.size(); i++) {
           String tipo = animais.get(i);
           tipo.getClass();
           System.out.println(tipo.toString());
            if (tipo.contains("Gato")) {
                System.out.println("miauuuuu");
                gatinho.FazerSom();

            }else if (tipo.contains("Cachorro")) {
                dogpool.FazerSom();
            }
        }



    }
}
