package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosExtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Implemente um programa que converta um número decimal para binário sem usar bibliotecas.
            System.out.print("Digite um número decimal: ");
            int decimal = sc.nextInt();
            String binario = " ";

            while (decimal > 0) {
                int resto = decimal % 2;
                //System.out.println(resto);
                binario = resto + binario;
                System.out.println(binario);
                decimal = decimal / 2;
            }

            System.out.println("O número binário é: " + binario);

        //Crie um programa que leia uma frase do usuário e conte quantas vogais existem na frase.
            System.out.print("Digite uma frase: ");
            sc.nextLine();
            String frase = sc.nextLine().toLowerCase();
            char[] vetFrase = frase.toCharArray();
            int qtdVogais = 0;
            for (char letra : vetFrase){
                 if(letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u'){
                     qtdVogais++;
                 }
            }
            System.out.println("Quantidade total de vogais = " +qtdVogais);
        

     }
    }

