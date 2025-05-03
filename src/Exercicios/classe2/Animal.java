package Exercicios.classe2;

public class Animal {
    private String nome;
    private int idade;
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {}

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public  void FazerSom(){
        System.out.println("Fazendo som");
    }

}
