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
public class Mercado {

    public void Start() {

        ArrayList<Produtos> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean Produto = false;

        while (!Produto) {
            System.out.println("  Isso é um mercadinho, Voce quer oque:  "
                    + "1. Adicionar  /n 2.Remover /n 3. Ver carrinho /n 4. Pagar /n 5.sair");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("muito que bem! escolha agora essa sessao: "
                            + "1. Produtos  de limpeza  /n 2.brinquedos /n 3. roupas /n 4. comidas /n 5. eletronicos");
                    int escolha2 = scanner.nextInt();
                       scanner.nextLine();
                    switch (escolha2) {
                        case 1:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhaLimpeza = scanner.nextLine();
                            int precoC = 100;
                            Produtos produto = new Higiene(precoC, escolhaLimpeza);
                            produtos.add(produto);
                            break;
                        case 2:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhapet = scanner.nextLine();
                            int precob = 100;
                            Produtos produto2 = new Brinquedos(precob, escolhapet);
                            produtos.add(produto2);
                            break;
                        case 3:
                            System.out.println("Qual roupa vc quer adicionar? ");
                            String escolhaCosmeticos = scanner.nextLine();
                            int precoe = 100;
                            Produtos produto3 = new Roupas(precoe, escolhaCosmeticos);
                            produtos.add(produto3);
                            break;
                        case 4:
                            System.out.println("Qual comida vc quer adicionar? ");
                            String escolhaComida = scanner.nextLine();
                            int precod = 100;
                            Produtos produto4 = new Comidas(precod, escolhaComida);
                            produtos.add(produto4);
                            break;
                        case 5:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhabazar = scanner.nextLine();
                            int precol = 100;
                            Produtos produto5 = new Eletronicos(precol, escolhabazar);
                            produtos.add(produto5);
                            break;
                        default:
                            System.out.println("Opcao invalida! ");
                    }
                    break;
                case 2:
                    System.out.println("Oque voce quer remover:"
                            + "1. Produtos  de limpeza  /n 2.brinquedos /n 3. roupas /n 4. comidas /n 5. eletronicos");
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (escolha3) {
                        case 1:
                            System.out.println("Qual produto vc quer Remover? ");
                            String escolhaLimpeza = scanner.nextLine();
                            produtos.remove(escolhaLimpeza);
                            break;
                        case 2:
                            System.out.println("Qual produto vc quer Remover? ");
                            String escolhaBrinquedos = scanner.nextLine();
                            produtos.remove(escolhaBrinquedos);
                            break;
                        case 3:
                            System.out.println("Qual roupa vc quer Remover? ");
                            String escolhaRoupa = scanner.nextLine();
                            produtos.remove(escolhaRoupa);
                            break;
                        case 4:
                            System.out.println("Qual comida vc quer Remover? ");
                            String escolhaComidas = scanner.nextLine();
                            produtos.remove(escolhaComidas);
                        case 5:
                            System.out.println("Qual eletronico vc quer Remover? ");
                            String escolhaEletronico = scanner.nextLine();
                            produtos.remove(escolhaEletronico);
                            break;
                        default:
                            System.out.println("Opcao invalida! ");
                    }
                    break;
                case 3:
                    double valorTotal = 0;
                for (int i = 0; i < produtos.size(); i++) {
                    valorTotal += produtos.get(i).precoTotal;
                    System.out.println("Voce tem no seu carrinho: " + produtos.get(i).nome);
        }       
                    System.out.println("R$" + valorTotal);
                    break;
                case 4:
                    System.out.println("Parabens voce concluiu a sua compra!");
                    produtos.clear();
                    break;
                case 5:
                    System.out.println("Encerrando programa... ");
                    boolean produto = true;
            }
        }
    }
}
