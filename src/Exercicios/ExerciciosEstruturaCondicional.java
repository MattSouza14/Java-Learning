package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Escreva um programa que verifique se um número é positivo, negativo ou zero.
            System.out.print("Digite um número: ");
            float numero = sc.nextFloat();
            if (numero < 0){
                System.out.printf("O número digitado é negativo: %.1f", numero);
            }
            else {
                System.out.printf("O número digitado é positivo: %.1f", numero);
            }
            System.out.println(" ");
        //Crie um programa que leia a idade de uma
        // pessoa e exiba se ela é menor de idade ou maior de idade.
            System.out.print("Digite a sua idade: ");
            float idade = sc.nextFloat();

            if (idade >= 18){
                System.out.printf("Você tem %.0f anos, já é maior de idade", idade);
            }
            else {
                System.out.printf("Você tem %.0f anos, é menor de idade", idade);
            }
            System.out.println(" ");
        //Desenvolva um programa que determine se um número fornecido pelo usuário é par ou ímpar.
            System.out.println("Forneça um número: ");
            float numParImpar = sc.nextFloat();

            String resultado = numParImpar % 2 == 0? "Numero PAR" : "Numero IMPAR";
            System.out.println(resultado);
            System.out.println(" ");

        //Implemente um programa que, dado um valor de nota de um aluno, exiba
        // se ele foi aprovado (nota ≥ 7) ou reprovado.
            System.out.print("Forneça a sua média final: ");
            float mediaFinal = sc.nextFloat();

            resultado = mediaFinal >= 7? "Aprovado": "Repovado";
            System.out.println("Você está " + resultado);
            System.out.println(" ");
        //Escreva um programa que simule uma calculadora, permitindo ao usuário escolher a operação
        // (soma, subtração, multiplicação ou divisão) e dois números para realizar o cálculo.
            System.out.println("Qual operação matematica que realizar?");
            System.out.println("1 - SOMA|2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO|4 - DIVISÃO");
            int operacao = sc.nextInt();
            System.out.println("Informe o primerio número: ");
            float num1 = sc.nextFloat();
            System.out.println("Informe o segundo número: ");
            float num2 = sc.nextFloat();
            float result;
            switch (operacao){
                case 1:
                    result = num1 + num2;
                    System.out.printf("Resultado da soma = %.2f", result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.printf("Resultado da subtração = %.2f", result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.printf("Resultado da multiplicação = %.2f", result);
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("Divisão por 0 não permitida");
                    }else {
                        result = num1 / num2;
                        System.out.printf("Resultado da multiplicação = %.2f", result);
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
            }










    }
}
