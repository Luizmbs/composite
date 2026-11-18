package org.example;

public class Catalog {

    private CatalogItem raiz;

    public void setRaiz(CatalogItem raiz) {
        this.raiz = raiz;
    }

    public String getCatalogo() {
        if (this.raiz == null) {
            throw new NullPointerException("Catálogo sem acervo");
        }
        return this.raiz.getConteudo();
    }
}
