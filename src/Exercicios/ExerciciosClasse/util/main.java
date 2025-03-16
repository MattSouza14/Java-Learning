package Exercicios.ExerciciosClasse.util;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor para C: ");
        double c = sc.nextDouble();

        Retangulo ret1 = new Retangulo(b, c);
        Circulo cir1 = new Circulo(b, c);
        Quadrado quad1 = new Quadrado(b);
        System.out.println(ret1.CalcularAreaR());
        System.out.println(cir1.CalcularAreaC());
        System.out.println(quad1.CalcularAreaQ());




        sc.close();

    }
}
