package pacoteaula04;

/**
 *
 * @author adaltoss
 */
public class Conta {
    
    public static final double SALDO_MINIMO = 10;
    
    public static double tarifa = 1.0;
    
    private String numero;
    private double saldo;
    
    public Conta(String numero){
        this.numero = numero;
        this.saldo = 0;
        
    }
    
    //Método modificador do atributo número
    public void setNumero(String numero){
        // poderia aqui colocar uma verificação se o user 
        // que está logado é o admin e tem permissão para fazer esta alteração
        this.numero = numero;
    }
    
    
    // Método acessor do atributo numero
    public String getNumero(){
        // poderia aqui colocar uma verificação se o user está logado
        return this.numero;
    }
    
    
    // Método acessor do atributo saldo
    public double getSaldo(){
        // poderia aqui colocar uma verificação se o user está logado
        return this.saldo;
    }
    
    public void depisitar(double valor){
        if( valor > 0 ){
            this.saldo += valor;
            this.descontarTarifa();
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Valor incorreto");
        }
    }
    
    public void sacar(double valor){
        if( valor > 0 && this.saldo >= valor ){
            this.saldo -= valor;
            this.descontarTarifa();
            System.out.println("Saque realizado");
        }else{
            System.out.println("Valor incorreto ou saldo insuficiente");
        }
    }
    
    private void descontarTarifa(){
//        double tarifa = 0.5; // buscar o valor da taria no banco de dados
//        this.saldo -= tarifa;
        this.saldo -= Conta.tarifa;
    }
}
