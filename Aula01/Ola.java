import java.util.Scanner;

public class Ola {
 
	public static void main(String[] args) {
		
		int idade = 0;
		double y = 2.0;
		boolean temFilhos = true;
		char primeiraLetraNome = 'A';

		String nome = "";

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		nome = leitor.next();

		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		if( idade >= 18){
			System.out.println("Nome: " + nome + "\nÉ maior de idade: " );
		}else{
			System.out.println("Nome: " + nome + "\nÉ menor de idade: ");
		}

	}

}