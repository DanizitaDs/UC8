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

    // Métodos
    public void  dadosDoAluno() {
        System.out.println("Olá, o meu nome é " + nome + " e estou cursando " + curso + ", minha matricula é " + matricula );
    }
}
 

