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
public class ClasseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamanho = 4;
        System.out.println("PRIMEIRA IMPLEMENTAÇÃO: ");
        System.out.println("------------------------");
        
        String [] array1 = new String[tamanho];
        
        ArrayFirst teste = new ArrayFirst(array1, tamanho);
        
        teste.addElemento("Milena", 0);
        teste.addElemento("Yssis", 2);
        teste.addElemento("Dani", 1);
        
        for (int i = 0; i < teste.getTamanho(); i++) {
        System.out.println(teste.recuperarElemento(i));
        }
        
        System.out.println("-------------------------");
        
        teste.removeElemento(0);
        
        for (int i = 0; i < teste.getTamanho(); i++) {
        System.out.println(teste.recuperarElemento(i));
        }
        
        System.out.println("--------------------------");
        
        teste.addElemento("Milena", 4);
        
        for (int i = 0; i < teste.getTamanho(); i++) {
        System.out.println(teste.recuperarElemento(i));
        }
        
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("SEGUNDA IMPLEMENTAÇÃO: ");
        System.out.println("------------------------");
        
        String [] array2 = new String[tamanho];
        ArraySecond teste2 = new ArraySecond(array2, tamanho);
        
        teste2.addElemento("Milena", 0);
        teste2.addElemento("Yssis", 2);
        teste2.addElemento("Dani", 1);
        
        for (int i = 0; i < teste2.getTamanho(); i++) {
        System.out.println(teste2.recuperarElemento(i));
        }
        
        System.out.println("-------------------------");
        
        teste2.removeElemento(0);
        
        for (int i = 0; i < teste2.getTamanho(); i++) {
        System.out.println(teste2.recuperarElemento(i));
        }
        
        System.out.println("--------------------------");
        
        teste2.addElemento("Milena", 4);
        
        for (int i = 0; i < teste2.getTamanho(); i++) {
        System.out.println(teste2.recuperarElemento(i));
        }
        
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("TERCEIRA IMPLEMENTAÇÃO: ");
        System.out.println("------------------------");
        
        String [] array3 = new String[tamanho];
        ArrayThird teste3 = new ArrayThird(array3, tamanho);
        
        teste3.addElemento("Milena", 0);
        teste3.addElemento("Yssis", 2);
        teste3.addElemento("Dani", 1);
        
        for (int i = 0; i < teste3.getTamanho(); i++) {
        System.out.println(teste3.recuperarElemento(i));
        }
        
        System.out.println("-------------------------");
        
        teste3.removeElemento(0);
        
        for (int i = 0; i < teste3.getTamanho(); i++) {
        System.out.println(teste3.recuperarElemento(i));
        }
        
        System.out.println("--------------------------");
        
        teste3.addElemento("Milena", 4);
        
        for (int i = 0; i < teste3.getTamanho(); i++) {
        System.out.println(teste3.recuperarElemento(i));
        }
        
        System.out.println("------------------------");
        System.out.println("");
        
    }
    
}
