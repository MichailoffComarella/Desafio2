/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classearray;

/**
 *
 * @author Sony
 */
public abstract class ClasseAbstrata {
    
    protected String[] name;
    protected int tamanho;

    public ClasseAbstrata(String[] name, int tamanho) {
        this.name = name;
        this.tamanho = tamanho;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
  
    
}
