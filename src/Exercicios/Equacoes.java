package Exercicios;

import java.util.Scanner;

public class Equacoes {
    double a;
    double b;

    public Equacoes(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Double CalcularEquacao(){
        return -b / a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("Digite o primeiro número: ");
         double a = sc.nextDouble();
         System.out.println("Digite o segundo número: ");
         double b = sc.nextDouble();

        Equacoes eq1 = new Equacoes(a, b);

        System.out.println("O resultado da equação = " + eq1.CalcularEquacao());

        sc.close();
    }
}
