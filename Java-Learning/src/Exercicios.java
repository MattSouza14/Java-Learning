import java.util.Scanner;


import util.Conversor;

public class Exercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do dolar: ");
        double DolarValue = sc.nextDouble();
        System.out.println("Informe quantos dolares ira comprar: ");
        double DolarQuantity = sc.nextDouble();

        double Result =Conversor.DolarToReal(DolarValue, DolarQuantity);

        System.out.printf("O total a ser pago em R$ %.2f: ", Result);
        System.out.println("Imposto: " + Conversor.IOF);
        sc.close();


    }

}
//teste