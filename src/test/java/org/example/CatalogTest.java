package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void deveRetornarCatalogoCompleto() {
        Section secao1 = new Section("Ficção");

        Section secao2 = new Section("Tecnologia");
        Book livro21 = new Book("Padrões de Projeto", 350);
        secao2.addItem(livro21);

        Section secao3 = new Section("História");
        Book livro31 = new Book("O Guia do Brasil", 420);
        Book livro32 = new Book("Civilizações Antigas", 500);
        secao3.addItem(livro31);
        secao3.addItem(livro32);

        Section acervo = new Section("Acervo Geral");
        acervo.addItem(secao1);
        acervo.addItem(secao2);
        acervo.addItem(secao3);

        Catalog catalog = new Catalog();
        catalog.setRaiz(acervo);

        assertEquals("Seção: Acervo Geral\n" +
                "Seção: Ficção\n" +
                "Seção: Tecnologia\n" +
                "Livro: Padrões de Projeto - número de páginas: 350\n" +
                "Seção: História\n" +
                "Livro: O Guia do Brasil - número de páginas: 420\n" +
                "Livro: Civilizações Antigas - número de páginas: 500\n", catalog.getCatalogo());
    }

    @Test
    void deveRetornarExcecaoCatalogoSemAcervo() {
        try {
            Catalog catalog = new Catalog();
            catalog.getCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Catálogo sem acervo", e.getMessage());
        }
    }
}
