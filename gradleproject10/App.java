/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject10;

public class App {
    public static void main(String[] args) {
        // Criando objetos de Pessoa, Carro e Animal
        Aluno pessoa = new Aluno("Carlos","informatica", 3014329);
        Livro caderno = new Livro("amorDms" , "jorgeMateus" , 24);
        Produto item = new Produto("Leite", 5 , 5);

        pessoa.dadosDoAluno();
        caderno.informações();
        item.valorTotalEstoque();
    }
}
