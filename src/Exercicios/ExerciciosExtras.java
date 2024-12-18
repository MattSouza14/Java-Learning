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
        //Faça um programa que leia uma string e exiba a string invertida.





        //Fazer um programa que faça a criptografia de uma String para numeros
        // ex: letra a -> 1 b-> 2....

            System.out.println("Digite uma frase: ");
            String texto = sc.nextLine().toLowerCase();
            String resultado = criptoTexto(texto);
            System.out.println("Frase criptografada: " + resultado);


     }
     public static String criptoTexto(String cripto){
         String fraseConvertida = "";
         char[] vetFrase = cripto.toCharArray();
         //mateus =1312052119
         char[] letras = new char[]{
                 'a','b','c','d','e','f','g','h',
                 'i','j','k','l','m','n','o','p',
                 'q','r','s','t','u','v','j','x',
                 'y','z'};
         for (int i = 0; i < vetFrase.length; i++) {
             for (int j = 0; j < letras.length; j++) {
                 if (vetFrase[i] == letras[j]) {
                     fraseConvertida += (j + 1);
                     break;
                 }
             }
         }

         return fraseConvertida;
     }
    }

