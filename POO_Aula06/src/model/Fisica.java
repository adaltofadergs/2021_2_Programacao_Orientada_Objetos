package model;

/**
 *
 * @author adaltoss
 */
public class Fisica extends Pessoa{
    
    public String cpf;
    protected double altura;
    
    public Fisica(){
        super();
    }

    public Fisica(String cpf, double altura, int id, String nome, String endereco, String telefone) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.altura = altura;
    }

    
    @Override
    public void cadastrar() {
//        super.cadastrar(); 
//        System.out.println("CPF: " + cpf + "\nAltura: " + altura);
        
        String frase =  "Id: " + this.getId() + "\nNome: " + nome + 
                        "\nEndereço: "+ endereco + "\nTelefone: " + telefone +
                        "\nCPF: " + cpf + "\nAltura: " + altura + 
                        "\n\nPessoa Física cadastrada com sucesso!";
        System.out.println(frase);
    } 

    @Override
    public String toString() {
//        return super.toString();
        return "Fisica{ " +
                "Id: " + this.getId() + 
                ", Nome: " + nome + 
                ", Endereço: "+ endereco + 
                ", Telefone: " + telefone + 
                ", cpf=" + cpf + 
                ", altura=" + altura + "}";
    }

    

    
    
    
}
