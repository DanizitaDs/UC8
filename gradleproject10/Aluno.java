/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject10;

/**
 *
 * @author DANIELLEYASMINDIASPA
 */
public class Aluno {
    private String nome;
    private String curso;
    private int matricula;

    // Construtor
    public Aluno(String nome,String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    // M�todos
    public void  dadosDoAluno() {
        System.out.println("Ol�, o meu nome � " + nome + " e estou cursando " + curso + ", minha matricula � " + matricula );
    }
}
 

