package view;

import model.Fisica;
import model.Pessoa;



/**
 *
 * @author adaltoss
 */
public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(1, "João", "Rua A, 100", "987654321");
        p1.cadastrar();
        
        System.out.println("-----------");
        
        Fisica pf1 = new Fisica();
        pf1.setId(2);
        pf1.setNome("Maria");
        pf1.endereco = "Rua B, 150";
        pf1.setTelefone("3344-5566");
        pf1.cadastrar();
        
        System.out.println("-----------");
        
        Fisica pf2 = new Fisica("000.111.222.33", 1.75, 3, "José", "Rua A, 200", "2233-3322");
        pf2.cadastrar();
        
        System.out.println("--------- toString() ----");
      //  Pessoa p2 = new Pessoa();
        
        System.out.println(p1.toString());
        System.out.println("-----------");
        System.out.println(pf2.toString());
        
    }
    
}
