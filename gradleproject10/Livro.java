/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject10;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class Livro {
    private String titulo;
    private String autor;
    private int pagina;

    // Construtor
    public Livro(String titulo,String autor, int pagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    // M�todos
    public void informa��es() {
        System.out.println("Ol�, o titulo do livro � " + titulo + " e seu autor � " + autor + ", possui " + pagina + " paginas nele.");
    }
}

