package aula05;

/**
 *
 * @author adaltoss
 */
public class Produto {
    public String nome;
    public double preco;

    public Produto() {
        
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }

    
    
    
    
}
