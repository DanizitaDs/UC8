/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
import java.util.ArrayList;

public class AdicionarComArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Criar um ArrayList

        // Adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

    // Imprimir o ArrayList
    System.out.println(numeros);
 
    //Get- retorna o elemento na posição especificada
    System.out.println(numeros.get(2));
    
    //Set - altera o elemento na posição especifica
    numeros.set(2,77);
    System.out.println(numeros.get(2));
    
    //Remover todos os elementos da lista
    //numeros.clear()
    
    //Retorna o tamanho da lista
    numeros.size();
    
    //Retorna se a lista esta vazia ou n
   numeros.isEmpty();//retorna true se a lista estiver vazia
   
   //Retorna true se a lista contiver o elemento
   numeros.contains(5);//false
    
    
    }
}
