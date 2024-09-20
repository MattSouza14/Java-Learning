// package Java_Learning;
//import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		//Variaveis e tipos de dados
		//Declaração
		//tipo/nome/valor(opcional)
		  int idade = 25; //%d
		  double altura = 1.6732505; //%f
		  float peso = 73.50f; //%f
		  char sexo = 'F'; //%s texto
		  boolean VouF = true;
		  
		  //Saida de dados
		  System.out.println("Olá");//Quebra de linha ln
		  System.out.print("Mundo");
		  
		  System.out.println(idade);
		  System.out.println((altura));
		  System.out.printf("%.2f\n", altura);//Formatado(por padrão pega o padrão do computador que está usadno
		  
		  System.out.printf("Resultado = %f metros", altura);

		    //Casting -> conversão explicita de valores
			double a;
			int b;
			a = 5.0;
			b = (int) a;//Casting
			
			
			//Entrada de Dados/Leitura
			//Usar o obj tipo Scanner
			//import java.util.Scanner;
			
			Scanner sc = new Scanner(System.in);
			
			String x;
			x = sc.next();//palavras
			//sc.next().charAt(0);//Ler um caractere
			//sc.nextLine();//Lendo texto até a quebra de linha
			//sc.nextInt();//Numeros inteiros
			//sc.nextDouble();//Numeros ponto flutuantes
			System.out.println("Voce digitou: " + x);
			sc.close();
			
			//Algumas funções matematicas 
			double w = 3.0;
			double y = 5.0;
			double z = 4.0;
			
			double A,B,C;
			
			A = Math.sqrt(w);
			B = Math.sqrt(y);	
			C = Math.sqrt(z);
			
		   System.out.println(A);
		   System.out.println(B);
		   System.out.println(C);
			
			A = Math.pow(w, y);
			B = Math.pow(y, 2.0);	
			C = Math.pow(5.0, 3.0);
			
		   System.out.println(A);
		   System.out.println(B);
		   System.out.println(C);
		   
		   
		   A = Math.abs(-4.0);
		   B = Math.abs(7.6);
		   
		   System.out.println(A);
		   System.out.println(B);
		  
		  
		  
		  
	}

}
