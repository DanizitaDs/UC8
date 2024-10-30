/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compras;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DANIELLEYASMINDIASPA
 */
abstract class Produtos {
    String nome;
    int precoTotal;
    
 public Produtos(int precoTotal,String nome) {
        this.precoTotal = precoTotal;
        this.nome = nome;
    }
 
 public void descricao(){
    System.out.println("voce possui: "+ nome + ",e o preco total é: " + precoTotal);

    }

}