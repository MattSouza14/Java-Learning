
import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Operadores comparativos
		// >, <, >=, <=, ==, !=
		// Operadores logicos
		// &&, ||, !

		int x = -9;

		if (x <= 0) {
			System.out.println("Menor igual a 0");
		} else if (x >= 5 && x <= 10) {
			System.out.println("Entre 5 e 10");
		} else {
			System.out.println("Maior que 10");
		}

		// Operadores de atribuição acumulativa
		// +=, -=, *=, /=, %=

		// Switch case
		int numDia = sc.nextInt();
		String dia;
		
		switch (numDia) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Invalido";
			break;
		}
		sc.close();
		System.out.println("Dia da semana" + dia);
	
		//Expressão ternária
		//(condição) ? valorVerdareiro : valorFalso
		String VouF = (5 > 4)? "verdadeiro" : "falso";
		System.out.println(VouF);
		
	}
	
}
