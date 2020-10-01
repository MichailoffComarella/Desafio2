/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classearray;

import java.util.Arrays;

/**
 *
 * @author Sony
 */
public class ArrayFirst extends ClasseAbstrata {

    public ArrayFirst(String[] name, int tamanho) {
        super(name, tamanho);
    }
    
    public void addElemento(String elemento, int posicao) {
        if (posicao > (this.getTamanho()-1)) {

            int novoTamanho = (this.getTamanho()*2);

            String[] nova = new String[novoTamanho];

            System.arraycopy(name, 0, nova, 0, name.length);

            this.setName(nova);

            this.setTamanho(novoTamanho);

            this.name[posicao] = elemento;
        } else {
            this.name[posicao] = elemento;
        }
    
    }
    
    public void removeElemento(int posicao) {
    this.name[posicao] = null;
    }
    
    public String recuperarElemento(int posicao) {
    return this.name[posicao];
    }
    
    
    
}
