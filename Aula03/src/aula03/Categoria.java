
package aula03;

/**
 *
 * @author adaltoss
 */
public class Categoria { 
    
    public int id;
    public String nome;

    public Categoria() {
        
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.nome;
    }
    
   
    // Exercício
    // -------------------------
    // Criar as classes Cliente e Cidade, com seus 
    // respectivos atributos, métodos construtores e métodos
    // get e set.
    // Lembrando que a classe Cliente possui tembém um 
    // atributo cidade
    
    
    
}
