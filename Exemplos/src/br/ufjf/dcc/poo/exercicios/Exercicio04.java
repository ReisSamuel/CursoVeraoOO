package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio04 { // Exercicio das moedas

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int valor, q100, q50, q25, q10, q5, q1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("digite o valor em centavos: ");
		valor = teclado.nextInt();

		q100 = valor / 100;
		valor = valor % 100;

		q50 = valor / 50;
		valor = valor % 50;

		q25 = valor / 25;
		valor = valor % 25;

		q10 = valor / 10;
		valor = valor % 10;

		q5 = valor / 5;
		q1 = valor % 5;

		System.out.println("moedas de 1 real = " + q100);
		System.out.println("moedas de 50 centavos = " + q50);
		System.out.println("moedas de 25 centavos = " + q25);
		System.out.println("moedas de 10 centavos = " + q10);
		System.out.println("moedas de 5 centavos = " + q5);
		System.out.println("moedas de 1 centavo = " + q1);
   
		teclado.close();
	}
}
