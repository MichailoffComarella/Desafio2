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
public class ArrayThird extends ClasseAbstrata {
    
    public ArrayThird(String[] name, int tamanho) {
        super(name, tamanho);
    }
    
    public void addElemento(String elemento, int posicao) {
        if (posicao > (this.getTamanho()-1)) {
            System.out.println("Infelizmente o Array já está cheio e não é "
                    + "possível adicionar mais elementos.");
            System.out.println("");
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
