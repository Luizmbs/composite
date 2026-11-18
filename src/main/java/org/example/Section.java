package org.example;

import java.util.ArrayList;
import java.util.List;

public class Section extends CatalogItem {

    private List<CatalogItem> itens;

    public Section(String descricao) {
        super(descricao);
        this.itens = new ArrayList<CatalogItem>();
    }

    public void addItem(CatalogItem item) {
        this.itens.add(item);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Seção: " + this.getDescricao() + "\n";
        for (CatalogItem item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}
