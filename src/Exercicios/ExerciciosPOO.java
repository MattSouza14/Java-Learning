package Exercicios;

import entities.Acervo;
import entities.Carro;
import entities.Pessoa;
import entities.Book;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Crie uma classe Pessoa com os atributos nome e idade, e um método para exibir
        // essas informações.
         /*   System.out.println("Digite seu nome");
            String name =sc.nextLine();
            System.out.println("Digite sua idade");
            int age = sc.nextInt();
            sc.nextLine();

            Pessoa pessoa1 = new Pessoa(name, age);

            System.out.println(pessoa1.toString());*/

        //Implemente uma classe Carro com os atributos marca, modelo e ano, e um
        // método para calcular a idade do carro.
        /*    System.out.print("Digite o modelo do carro ");
            String modelo = sc.nextLine();
            System.out.print("Digite a marcado carro");
            String marca = sc.nextLine();
            System.out.println("Digite o ano do carro");
            int ano = sc.nextInt();

            Carro carro1 = new Carro(modelo, marca, ano);

            System.out.println(carro1.toString());
            System.out.println("Idade do carro = " + carro1.CalcularIdadeDoCarro(2024));*/
        //Desenvolva uma classe Livro que tenha os atributos título, autor e
        // número de páginas,depois uma classe Acervo onde todos os livros serão adicionados
        // e que possa fornecer uma lista com todos o livros
            Acervo acervo = new Acervo();
            System.out.println("Cadastro de livros");
            System.out.print("Quantos livros deseja cadastrar: ");
            int qtdLivros = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <=qtdLivros; i++){
            System.out.print("Informe o titulo do livro: ");
            String titulo = sc.nextLine();
            System.out.print("Informe o nome do autor: ");
            String autor = sc.nextLine();
            System.out.print("Informe a quantida de paginas: ");
            int paginas = sc.nextInt();
            sc.nextLine();

            Book livro = new Book(autor, titulo, paginas);
            acervo.adicionarLivro(livro);
        }
            System.out.print("Deseja consultar o acervo [S|N]?  ");
            String res = sc.nextLine().toUpperCase();

            if (res.equals("S")){
                acervo.listarLivros();
            }
            else {
                System.out.println("Fim :)");
            }

















    }
}
