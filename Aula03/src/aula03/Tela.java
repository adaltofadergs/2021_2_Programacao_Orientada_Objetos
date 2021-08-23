package aula03;

/**
 *
 * @author adaltoss
 */
public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Oi");
        
        int x = 1;
        double y = 1.0;
        
        Categoria c1 = new Categoria("Bebidas");
        Categoria c2 = new Categoria("Alimentos");
        
        
        Produto p1 = new Produto();
        p1.nome = "Salgadinho";
        p1.categoria = c2;
        
        Produto p2 = new Produto("Coca-cola 2L");
        Produto p3 = new Produto("Fanta 2L", 6.99 );
        
        p2.categoria = c1;
        p3.categoria = c1;
        
        Produto p4 = new Produto(1, "Bolo", 12.95, 10, c2);
        
//        System.out.println("Nome do produto p2: " + p2.nome);
//        System.out.println("Nome do produto p3: " + p3.nome 
//                + "\nPreço: " +  p3.preco);
        
        p2.imprimir();
        System.out.println("------------------");
        p3.imprimir();
        p3.aumentarPreco( 10 );
        System.out.println("Nome preço do p3: " + p3.getPreco());
        
        
        p1.imprimir();
        
        System.out.println(" ---------- P4 ------");
        p4.imprimir();
        
        System.out.println(" ---------- Categoria ------");
        
        System.out.println( c1.toString() );

    }
    
}
