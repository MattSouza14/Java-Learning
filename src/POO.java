import java.util.Locale;
import java.util.Scanner;

import entities.*;
import util.Calculator;
public class POO {
    //private - o membro só pode ser acessado na própia classe
//nada- o membro só pode ser acessado nas classes do mesmo pacote
//protected - o membro só pode ser acessado no mesmo pacote,
// bem como em subclasse de pacotes diferentes
//public - o membro é acessado por todas classes(ao menos que ele resida
// em um modulo diferente que não exporte
//o pacote onde ele está
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Classe -> tipo estruturado que pode contar (membros)
        //Atributos(dados/campos)
        //Metodos(funções/ operações

        //Construtores, Sobrecarga, Encapsulamento, Herança, Polimorfismo

        //Object
        //getClass - retorna o tipo do objeto
        //equals - compara se o objeto é igual ao outro
        //hashCode - retorna um codigo hash do objeto
        //toString - converte o objeto para string

        //Membros Estáticos = membros de classe
        //Chamados a partir do propio nome da classe

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        // System.out.print("Quantity in stock: ");
        // int quantity = sc.nextInt();
        //INSTANCIAÇÃO
        Product product = new Product(name, price);
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();

        //Construtores - operação especial da classe que executa no momento da instanciação do objeto
        //Sobrecarga - recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes parâmetros
        //Encapsulamento - consiste em esconder detalhes de implementação de uma classe, expondo apneas operações
        //seguras e que mantenham os objetos em um estado consistente.


        //Herança - permite que uma classe herde todos dados e comportamentos de outra
        //class A extends B

        //Account acc = new Account(1001,"Alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//
//        //Upcasting
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003,"bob", 0.0,  200.0);
//        Account acc3 = new BusinessAccount(1004,"ana", 0.0,  50.0);
//
//        //Downcasting
//        BusinessAccount acc4 = (BusinessAccount)acc2;
//
//        if(acc3 instanceof BusinessAccount){
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.print("Empresitmo");
//        }
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.print("Uptade");
//        }

        //Sobreposição - Implementação de um metodo de uma superclasse na subclasse
        //Recomenvável usar a anotação @Overrride em um meto sobrescrito

        //public final class-> evita que a classe seja herdada
        //metodo -> evita que o metodo seja sobreposto

        //Polimorfismo recurso que permite que var de um mesmo tipo mais generico
        //possam apontar para objetos de tipos específicos diferentes, tendo assim
        //comportamentos diferentes conforme cada tipo


        //Classes abstratas -> não podem ser instanciadas
        //somete subclasses não abstratas podem ser instanciadas
    }

}
