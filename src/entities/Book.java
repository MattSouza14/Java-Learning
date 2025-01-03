package entities;

public class Book {
    private String title;
    private String author;
    private Integer numberPages;


    public Book() {
    }


    public Book(String author, String title, Integer numberPages) {
        this.author = author;
        this.title = title;
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: " + title + "\n");
        sb.append("Autor: " + author);
        return sb.toString();
    }

}
