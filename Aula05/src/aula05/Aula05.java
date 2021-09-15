
package aula05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adaltoss
 */
public class Aula05 {


    public static void main(String[] args) {
        
        int[] inteiros;
        inteiros = new int[5];
        
        double reais[] = new double[5];
        
        for( int i = 0; i < 5; i++ ){
            inteiros[i] = i * 10;
        }
        
        System.out.println(inteiros[4]);
        
        reais[0] = 2.5;
        reais[1] = 18.25;
        
        for( int i = 0; i < 5; i++ ){
            System.out.println( reais[i] );
        }
        
        for(int valor : inteiros){
            System.out.println(valor);
        }
        
        String nomes[] = new String[3];
        nomes[0] = "Adalto";
        nomes[1] = "João";
        nomes[2] = "Maria";
        
        String carros[] = { "Uno", "Doblo", "Toro"};
        
        for (int i = 2; i >= 0; i--) {
            System.out.println( nomes[i]);
        }
        
        for (String carro : carros) {
            System.out.println(carro);
        }
        
        Collection<String> frutas = new ArrayList<>();
        frutas.add( "Banana" );
        frutas.add( "Abacaxi" );
        frutas.add( "Laranja" );
        frutas.add( "Abacaxi" );
        
        System.out.println( frutas );
        
        Set<String> avioes = new HashSet<String>();
        avioes.add( "737-200" );
        avioes.add( "737-300" );
        avioes.add( "737-200" );
        System.out.println(avioes);  
        
        
         System.out.println("\n\nCom Set<>");
        Set<Produto> produtos = new HashSet<>();
        Produto p1 = new Produto("Coca-Cola", 5.99);
        Produto p2 = new Produto("Pepsi", 4.99);
        
        produtos.add(p1);
        
        System.out.println(produtos);
        
        p1.nome = "Fanta";
        produtos.add(p1);
        produtos.add(p2);
        
        System.out.println(produtos );
        
        
        System.out.println("\n\nCom List<>");
        
        List<Produto> listProdutos = new ArrayList<>();
        listProdutos.add(p1);
        listProdutos.add(p2);
        listProdutos.add(p1);
        listProdutos.add( new Produto("Fruki", 3.99) );
        listProdutos.add(p1);
        
        System.out.println(listProdutos);
        
        //listProdutos.remove( 0 );
        listProdutos.remove( p1 );
        listProdutos.remove( p1 );
        
        System.out.println(listProdutos);
        
        System.out.println("Tamanho da lista: " + listProdutos.size() );
        
        
    }
    
}
