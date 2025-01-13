package Exercicios.poo;

import entities.Acervo;
import entities.Book;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

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
