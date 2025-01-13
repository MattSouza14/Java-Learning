package Exercicios.poo;

import entities.Carro;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
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
    }
}
