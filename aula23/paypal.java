/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class paypal implements Pagamento {
    String email;
    public paypal(){
    email = "lsdhild@kns.com";
    }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " valor processado via PayPal");
}
    @Override
    public String obterDetalhes(){
   return email;
}
    
}
