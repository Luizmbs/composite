package org.example;

public class Book extends CatalogItem {

    private int numeroPaginas;

    public Book(String descricao, int numeroPaginas) {
        super(descricao);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getConteudo() {
        return "Livro: " + this.getDescricao() + " - número de páginas: " + this.numeroPaginas + "\n";
    }

}
