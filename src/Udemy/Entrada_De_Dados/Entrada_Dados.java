package Udemy.Entrada_De_Dados;

import java.util.Scanner;

public class Entrada_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        str = sc.next(); //Texto
        // sc.nextInt(); //Inteiro
        // sc.nextDouble(); //Flutuante
        //.charAt(0; //Pega o primeiro caractere
        // sc.nextLine(); Ler até a quebra de linha

        System.out.printf("Olha minha variavel ai: %s", str);

        sc.close();
    }
}
