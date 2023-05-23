package org.estrutura_arvore;

import java.util.TreeSet;

public class Arvore {

    private TreeSet<Integer> arvore;
    public Arvore(){
        this.arvore = new TreeSet<>();
    }
    public  void adcNo(Integer no){
        this.arvore.add(no);
    }

    public TreeSet<Integer> getArvore() {
        return arvore;
    }

    public void setArvore(TreeSet<Integer> arvore) {
        this.arvore = arvore;
    }
}
