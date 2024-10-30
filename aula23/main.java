/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class main {
    public static void main(String[] args) {
        cartaoCredito cartao = new cartaoCredito();
        paypal payPal = new paypal();
        
        cartao.processarPagamento(20);
        System.out.println(cartao.obterDetalhes());
        
        payPal.processarPagamento(40);
        System.out.println(payPal.obterDetalhes());
    }
}
