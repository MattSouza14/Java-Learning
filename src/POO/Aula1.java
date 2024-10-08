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
		
		//Object
		//getClass - retorna o tipo do objeto
		//equals - compara se o objeto é igual ao outro
		//hashCode - retorna um codigo hash do objeto
		//toString - converte o objeto para string
		
		//Membros Estáticos = membros de classe
		//Chamados a partir do propio nome da classe

	
			
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunferencia %2.f%n", c);
		System.out.printf("Volume %2.f%n", v);
		System.out.printf("PI %2.f%n", Calculator.PI);
			
			
			sc.close();
}
}