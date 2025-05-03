package Exercicios.classe2;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void FazerSom(){
        System.out.println("AUUU AUUU AU CACHORRO PIDÃO");
    }

}
