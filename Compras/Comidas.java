/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compras;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class Comidas extends Produtos {
    public Comidas( int precoTotal,String nome) {
        super(precoTotal,nome);
        }
    
    @Override
    public void descricao(){
    System.out.println("o item é: " + nome + ", e seu valor é: " + precoTotal);
    }
    
}
