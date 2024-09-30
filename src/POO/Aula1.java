package src.POO;
import java.util.Scanner;
import entities.Triangulo;
public class POO {

	public static void main(String[] args) {
		//Classe -> tipo estruturado que pode contar (membros)
		//Atributos(dados/campos)
		//Metodos(funções/ operações
		
		//Construtores, Sobrecarga, Encapsulamento, Herança, Polimorfismo
		
		Triangulo x,y;
		//INSTANCIAÇÃO
		x = new Triangulo();
		y = new Triangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os valores do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area triangulo X: %.4f%n", areaX);
		System.out.printf("Area triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area é X");
		}
		else {
			System.out.println("Maior area é Y");
		}
		sc.close();
		
	
}
}