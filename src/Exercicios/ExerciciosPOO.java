package Exercicios;

import entities.Carro;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Crie uma classe Pessoa com os atributos nome e idade, e um método para exibir
        // essas informações.
            System.out.println("Digite seu nome");
            String name =sc.nextLine();
            System.out.println("Digite sua idade");
            int age = sc.nextInt();
            sc.nextLine();

            Pessoa pessoa1 = new Pessoa(name, age);

            System.out.println(pessoa1.toString());

        //Implemente uma classe Carro com os atributos marca, modelo e ano, e um
        // método para calcular a idade do carro.
            System.out.print("Digite o modelo do carro ");
            String modelo = sc.nextLine();
            System.out.print("Digite a marcado carro");
            String marca = sc.nextLine();
            System.out.println("Digite o ano do carro");
            int ano = sc.nextInt();

            Carro carro1 = new Carro(modelo, marca, ano);

            System.out.println(carro1.toString());
            System.out.println("Idade do carro = " + carro1.CalcularIdadeDoCarro(2024));
        //Desenvolva uma classe Livro que tenha os atributos título, autor e
        // número de páginas, com um método para exibir o título e o autor.


        //Faça uma classe ContaBancaria com métodos para depositar e sacar dinheiro, e exiba o
        // saldo após as operações.

        //Escreva uma classe Retângulo que receba largura e altura e tenha um método para
        // calcular a área e outro para calcular o perímetro.















    }
}
