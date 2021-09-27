
package model;

/**
 *
 * @author adaltoss
 */
public class Pessoa {
    
    private int id;
    public String nome, endereco;
    protected String telefone;
    
    public Pessoa(){
   //     System.out.println("Pesoa criada");
    }

    public Pessoa(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    
    public void cadastrar(){
        String frase = "Id: " + id + "\nNome: " + nome + 
                       "\nEndereço: "+ endereco + "\nTelefone: " + telefone +
                       "\n\nPessoa cadastrada com sucesso!";
        System.out.println(frase);
        
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
}
