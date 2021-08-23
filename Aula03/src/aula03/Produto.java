package aula03;

/**
 *
 * @author adaltoss
 */
public class Produto {
    
    // Atributos
    public int id;
    public String nome;
    public double preco, quantidade;
    public Categoria categoria;
    
    
    // Métodos Construtores
    public Produto(){
        this.preco = 10.0;
    }
    public Produto(String nome){
        this.nome = nome;
        this.preco = 10.0;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(int id, String nome, double preco, double quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
    
    // Métodos
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Categoria: " + this.categoria.nome);
    }
    public void aumentarPreco(double percentual){
        this.preco += this.preco * percentual / 100; 
    }
    
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
