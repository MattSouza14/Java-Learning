package entities;
import java.util.ArrayList;
import java.util.List;

public class Acervo {

 private  ArrayList<Book> livros;

    public Acervo(){
        this.livros = new ArrayList<>();
    }

    public ArrayList<Book> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Book> livros) {
        this.livros = livros;
    }

    public  void adicionarLivro(Book livro) {
        livros.add(livro);
    }

    public  void listarLivros(){
        for (Book livro : livros) {
            System.out.println(livro);
        }
    }

}
