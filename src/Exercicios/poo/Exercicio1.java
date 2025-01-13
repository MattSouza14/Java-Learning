package Exercicios.poo;

import entities.Acervo;
import entities.Book;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
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


    }
}
