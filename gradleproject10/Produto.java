/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject10;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    // Construtor
    public Produto(String nome,int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // M�todos
    public void  valorTotalEstoque() {
        System.out.println("O nome do produto �: " + nome + ", o pre�o �: " + preco + ", e a quantidade foi: " + quantidade + ", ao total ficou: " + (preco * quantidade)  );
    }
}
