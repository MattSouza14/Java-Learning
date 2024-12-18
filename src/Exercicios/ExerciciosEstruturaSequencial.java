package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Implemente um programa que calcule a soma de dois números inteiros.
            int x = 5;
            int y = 6;
            System.out.printf("Resultado da soma de interios = %d", x + y);
            System.out.println(" ");
        //Escreva um programa que leia dois números do usuário
        //e exiba o resultado da multiplicação deles.

            System.out.println("Digite o primeiro número");
            float m = sc.nextFloat();
            System.out.println(" ");
            System.out.println("Digite o segundo número");
            float n = sc.nextFloat();
            System.out.printf("Resultado da multiplicação = %.2f", m * n);
            System.out.println(" ");
        //Crie um programa que converta uma temperatura de Celsius para Fahrenheit.
            System.out.println("Conversão de tempetatura C -> F");
            double celcius = 37;
            double farenheit;

            farenheit = 1.8 * celcius + 32;
            System.out.printf("Resultado da conversão = %.2f", farenheit);
            System.out.println(" ");
        //Faça um programa que calcule o IMC (Índice de Massa Corporal) de uma
        //pessoa com base no peso e altura fornecidos.
            System.out.print("Digite o seu peso: ");
            double peso = sc.nextDouble();
            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();
            double imc = peso / (altura * 2);
            System.out.printf("Resultado do seu IMC = %.2f", imc);
            System.out.println(" ");
        //Desenvolva um programa que calcule a média de três números
        // inteiros fornecidos pelo usuário.
            System.out.println("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();
            System.out.println("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();
            System.out.println("Digite a terceira nota: ");
            float nota3 = sc.nextFloat();

            float mediaAlunos = (nota1 + nota2 + nota3) / 3;
            System.out.printf("Resultado da média do aluno = %.2f", mediaAlunos);

    }
}
