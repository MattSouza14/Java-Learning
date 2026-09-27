package Udemy.Estrutura_Sequencial;

import java.util.Locale;

// Organizaçao de material de estudo em capitulos

public class Variaveis {

// Sintaxe
// <Tipo> <Nome> = <Valor Inicial>; <-Opcional
 //Tabela unicode - "unicode-table.com"
public static void main(String[] args) {
// Tipo Primitivos: 
int inteiro = 25; //Valores de -2147483648 a 2147483647
double doubl  = 1.68; //Valores de -4,94E-307 a 1,79E+308
char chr = '\u0061'; //Valores de "\u0000" a "\uFFFF" caractere unicode
byte byt = 127; // Valores de -128 a 127 
String str = "ABCD";
float flt = 2.55f; //Valores de -1,4024E-37 a 3,4028E+38
boolean bool  = false;  

    System.out.print("Imprimindo Inteiro: ");
    System.out.println(inteiro);

    System.out.print("Imprimindo Double: ");
    System.out.println(doubl);

    
    System.out.print("Imprimindo Char: ");
    System.out.println(chr);


    System.out.print("Imprimindo Byte: ");
    System.out.println(byt);


    System.out.print("Imprimindo String: ");
    System.out.println(str);


    // "%.2f%n"
    System.out.print("Imprimindo Float: ");
    System.out.println(flt);

 
    System.out.print("Imprimindo Boolean: ");
    System.out.println(bool);

    //Trocando a logalização
    Locale.setDefault(Locale.US);

    // %f - flutuante
    // %d - inteiro
    // %s - texto
    // %n - quebra de linha
    System.out.printf("Texto Formatado com Variavel:  %d - Inteiro", inteiro);
   
        
   //Casting - convertendo variaveis exemplos (int) , (double) 



    
}
 


}
