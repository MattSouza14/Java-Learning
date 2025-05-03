package Exercicios.ListaExercicios;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mateus", "Souza");
        Funcionario f1 = new Funcionario(214, 100.0, "Mateus", "Souza");
        Professor prof1 = new Professor(144, 100.0, "Nelso", "Javeiro");

        System.out.println("Primeira parcela do Funcionario: " + f1.getNome() + " é " + f1.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do Funcionario: " + f1.getNome() + " é " +f1.getSalarioSegundaParcela());
        System.out.println(p1.getClass());
        System.out.println(f1.getClass());
        System.out.println(prof1.getClass());


    }
}
