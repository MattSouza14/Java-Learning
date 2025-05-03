package Exercicios.classe2;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);

    }
    @Override
    public void FazerSom(){
        System.out.println("Miauuu maiuuu krl");
    }

}
