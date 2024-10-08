package src.POO;

import java.util.Scanner;

public class ExerciciosPOO {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	} 

	TrianguloRetangulo rect = new TrianguloRetangulo();
	System.out.println("Enter rectangle width and height:");
	rect.width = sc.nextDouble();
	rect.height = sc.nextDouble();
	System.out.printf("AREA = %.2f%n", rect.area());
	System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
	System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
	
	System.out.println("Informe o valor do dolar: ");
		double DolarValue = sc.nextDouble();
	System.out.println("Informe quantos dolares ira comprar: ");
		double DolarQuantity = sc.nextDouble();
		
		double Result =Conversor.DolarToReal(DolarValue, DolarQuantity);
		
	System.out.printf("O total a ser pago em R$ %.2f: ", Result);
	System.out.println("Imposto: " + Conversor.IOF);
	sc.close();

}
