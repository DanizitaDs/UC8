/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cla;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
abstract class Cla {
    String nomeDoCla;
    String lider;
    
    public abstract void habilidadeEspecial();
    public void exibirDetalhes(){
    System.out.println("nome do cla:" + nomeDoCla + ", e seu lider é: " + lider);
    }
}
