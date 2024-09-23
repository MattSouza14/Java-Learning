import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// Exercicios
		//1
		String product1 = "Computer";
		String product2 = " Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n %s,which price is $ %.2f\n%s, which price is $ %.2f", 
				product1, price1, product2, price2);
		System.out.printf("\nRecord: %d years old, code %d and gender: %s", age, code, gender);
		System.out.printf("\n Measue with eight decimal places: %f \nRouded(three decimal places): %.3f", 
				measure, measure);
		
		//Faça um programa para ler dois valores 
		//inteiros, e depois mostrar na tela a soma desses 
		//números com uma mensagem explicativa, conforme exemplo
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, SOMA;
		System.out.println("\nDigite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("\nDigite o segundo número: ");
		num2 = sc.nextDouble();
		
		SOMA = num1 + num2;
		
		System.out.println("SOMA = " + SOMA);
		
		//Faça um programa para ler o valor do raio de um círculo, 
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		
		double raio, area;
		double PI = 3.14159;
		
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		//Fazer um programa para ler quatro valores inteiros 
		//A, B, C e D. A seguir, calcule e mostre a diferença do 
		//produto de A e B pelo produto de C e D segundo a fórmula: 
		//DIFERENCA = (A * B - C * D).
		
		int A,B,C,D;
		int dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.printf("Diferença = %d", dif);

		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		// decimais

		int numFuncionario;
		double horasTrabalhadas, valorHoraTrabalhada, salario;
		
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorHoraTrabalhada = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.printf("NUMBER: %d\nSALARY: %.2f", numFuncionario, salario);

		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		double cod1, cod2, numPecas1, numPecas2, valor1, valor2, total;
		
		cod1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (valor1 * numPecas1 + valor2 * numPecas2);
		
		System.out.printf("VALOR A PAGAR: %.2f", total);


		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		// mostre:
		// a) a área do triângulo retângulo que tem A por base e C por altura.
		// b) a área do círculo de raio C. (pi = 3.14159)
		// c) a área do trapézio que tem A e B por bases e C por altura.
		// d) a área do quadrado que tem lado B.
		// e) a área do retângulo que tem lados A e B

		double A1, B1, C1, area1, area2, area3, area4, area5;
		//PI já está declarado em uma questão mais acima
		
		A1 = sc.nextDouble();
		B1 = sc.nextDouble();
		C1 = sc.nextDouble();
		
		area1 = (A1 * C1) / 2;
		
		area2 =  PI * Math.pow(C1, 2);
		
		area3 = ((A1 + B1) * C1) / 2;
		
		area4 = Math.pow(B1, 2);
		
		area5 = A1 * B1;
		
		System.out.printf("TRIANGULO: %.3f", area1);
		System.out.printf("\nCIRCULO: %.3f", area2);
		System.out.printf("\nTRAPEZIO: %.3f", area3);
		System.out.printf("\nQUADRADO: %.3f", area4);
		System.out.printf("\nRETANGULO: %.3f", area5);


		//7
		int num;
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}

		//8
		
		int number;
		
		number = sc.nextInt();
		
		if (number % 2 ==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		//9

		int numA, numB;
		
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		if (numA % numB ==0 || numB % numA == 0 ) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Não multiplos");
		}
		
		sc.close();

		//10

		int horaI, horaF;
		
		
		horaI = sc.nextInt();
		horaF = sc.nextInt();
		int totalEvento;
		
		if (horaI < horaF) {
			totalEvento = horaI - horaF;
		}

		else {
			totalEvento = 24 - horaI + horaF;
		}
		System.out.println("O evento durou" + totalEvento);

		//11
		System.out.println("CODIGO\tESPECIFICAÇÃO\tPREÇO");
		System.out.println("\n1\tCachorro Quente\tR$4.00");
		System.out.println("\n2\tX-Salada\tR$4.50");
		System.out.println("\n3\tX-Bacon\t\tR$5.00");
		System.out.println("\n4\tTorrada simples\tR$2.00");
		System.out.println("\n5\tRefrigerante\tR$1.00");
		
		double codProduto,qtd,valorTotal;
		
		codProduto = sc.nextInt();
		qtd = sc.nextInt();
		
		if(codProduto == 1) {
			valorTotal = 4.0 * qtd;
			System.out.printf("Valor total: R$%.2f " , valorTotal);
		}
		else if(codProduto == 2) {
			valorTotal = 4.5 * qtd;
			System.out.printf("Valor total: R$%.2f " , valorTotal);
		}
		else if(codProduto == 3) {
			valorTotal = 5.0 * qtd;
			System.out.printf("Valor total: R$%.2f " , valorTotal);
		}
		else if(codProduto == 4) {
			valorTotal = 2.0 * qtd;
			System.out.printf("Valor total: R$%.2f " , valorTotal);
		}
		else if(codProduto == 5) {
			valorTotal = 1.5 * qtd;
			System.out.printf("Valor total: R$%.2f " , valorTotal);
		}
		else {
			System.out.println("Codigo do produto invalido");
		}
		
		//13
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		//14
		int senhaValida = 2002;
		
		int senha = sc.nextInt();
		
		while(senhaValida != senha) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		//15
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		
		while(X1 != 0 && Y1 !=0) {
			if(X1 > 0 && Y1 > 0) {
				System.out.println("Primeiro");
			}
			else if(X1 > 0 && Y1 < 0) {
				System.out.println("Quarto");
			}
			else if(X1 < 0 && Y1 < 0) {
				System.out.println("Terceiro");
			}
			else if(X1 < 0 && Y1 > 0) {
				System.out.println("Segundo");
			}
			else {
				System.out.println(".");
			}
			X1 = sc.nextInt();
			Y1 = sc.nextInt();
		}
		sc.close();
		//16
		System.out.println("\t\t Cod-Combustiveis");
		System.out.println("\n\t [1]-Alcool\t[2]-Gasolina");
		System.out.println("\n\t [3]-Diesel\t[4]-Fim");
		
		int codCombus = sc.nextInt();
		int sumAlcool = 0;
		int sumGasolina = 0;
		int sumDiesel = 0;
		
		while(codCombus != 4 && codCombus > 0) {
			if(codCombus == 1) {
				sumAlcool += 1;
			}
			else if(codCombus == 2) {
				sumGasolina += 1;
			}
			else if(codCombus == 3) {
				sumDiesel +=1;
			}
			codCombus = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("\n Alcool: %d", sumAlcool);
		System.out.printf("\n Gasolina; %d", sumGasolina);
		System.out.printf("\n Diesel: %d", sumDiesel);
	}
	
}

