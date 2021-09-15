package pacoteaula04;

/**
 *
 * @author adaltoss
 */
public class Tela {

    
    public static void main(String[] args) {
        Conta c1 = new Conta("12345-6");
        c1.sacar(25.5);
        System.out.println("--------");
        c1.depisitar( -10 );
        System.out.println("--------");
        c1.depisitar( 100 );
        System.out.println("--------");
        c1.sacar(50);
      
        
        
        System.out.println("Saldo C1: " + c1.getSaldo());
        
        
        
        Conta c2 = new Conta("54321-0");
        c2.depisitar(10);
        c2.sacar(5); 
        
        System.out.println("Saldo C2: " + c2.getSaldo());
        
       
        
        
    }
    
}
