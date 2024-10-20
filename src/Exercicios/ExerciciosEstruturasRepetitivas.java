package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturasRepetitivas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       // Faça um programa que exiba os números de 1 a 100 utilizando um laço for.""
            for(int i = 1; i <101; i++){
                System.out.println(i);
            }
       // Desenvolva um programa que peça ao usuário um número e exiba a tabuada desse número (de 1 a 10) utilizando um laço while.
            System.out.print("Informe o número: ");
            int num = sc.nextInt();
            int cont = 1;
            System.out.println("Motrando a tabuado do número " + num);
            while (cont <= 10){
                int resultado = cont * num;

                System.out.printf("%d X %d = %d\n", cont, num, resultado);
                cont++;
            }

       // Escreva um programa que leia 10 números e exiba quantos deles são pares utilizando um laço for.
            int quantPares = 0;
            for (int i = 1; i <10; i++){
                if(i % 2 == 0){
                    quantPares++;
                }

            }
            System.out.println("Total de pares = " + quantPares);
       // Crie um programa que calcule a soma de todos os números ímpares entre 1 e 50 utilizando um laço while.

            int soma = 0;
            cont = 1;
            while (cont <= 50){
                if (cont % 2 == 1){
                    soma+= cont;
                }
                cont++;
            }
            System.out.println("Soma total = " + soma);

       // Faça um programa que permita ao usuário inserir números até que ele insira o número zero, que encerra o programa.
            System.out.print("Informe um número: ");
            num = sc.nextInt();
            System.out.println("Digite 0 para finalizar");
            while (num != 0){
                System.out.println("Digite um número");
                num = sc.nextInt();
            }
            System.out.println("Programa finalizado :)");


    }
}
