import java.util.Scanner;

import javax.swing.JOptionPane;

// package aula02;

public class Tela01 {
		
	public static void main(String[] args) {
		System.out.println("Olá Mundo");

		Scanner leitor = new Scanner(System.in);

		/*
		Numero num01;
		num01 = new Numero();

		num01.x = 5;
		num01.y = 2;
		int soma = num01.somar();
		System.out.println("Soma de " + num01.x + " + " + num01.y + " = " + soma);

		
		Numero num02 = new Numero();

		System.out.print("Digite o valor de X: ");
		num02.x = leitor.nextInt();
		System.out.print("Digite o valor de Y: ");
		num02.y = leitor.nextInt();

		System.out.println("Subtração de " + num02.x + " - " + num02.y 
					+ " = " + num02.subtrair() );

		num02.x = Integer.valueOf( JOptionPane.showInputDialog(null, "Digite o valor de X: ") );
		num02.y = Integer.valueOf( JOptionPane.showInputDialog(null, "Digite o valor de Y: ") );

		JOptionPane.showMessageDialog(null, "Multiplicação de " + num02.x + " x " + num02.y 
					+ " = " + num02.multiplicar() );
		

		*/

		int opcao = 0;
		while( opcao != 5 ){

			System.out.println("------MENU -----");
			System.out.println("1 - Somar");
			System.out.println("2 - Sobtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");

			System.out.print("Digite sua opção: ");
			opcao = leitor.nextInt();

			Numero num = new Numero();
			System.out.print("Digite o valor de X: ");
			num.x = leitor.nextInt();
			System.out.print("Digite o valor de Y: ");
			num.y = leitor.nextInt();
			
			double resultado = 0;
			switch ( opcao ) {
				case 1:
					resultado = num.somar();
					break;
				case 2:
					resultado = num.subtrair();
					break;
				case 3:
					resultado = num.multiplicar();
					break;
				case 4:
					resultado = num.dividir();
					break;
				case 5:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
			}
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);


		}

	
	}

}
