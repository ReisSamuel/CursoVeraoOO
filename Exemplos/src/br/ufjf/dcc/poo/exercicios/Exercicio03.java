package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,delta;
		float x1,x2;
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		a = teclado.nextInt();
		System.out.println("Digite o valor de B:");
		b = teclado.nextInt();
		System.out.println("Digite o valor de C:");
		c = teclado.nextInt();
		
		delta = (float) (Math.pow(b, 2) - 4*a*c); //b²-4*a*c
		System.out.println("Delta = "+delta);
		x1 = (float) ((-(b)+Math.sqrt(delta))/(2*a)); // -b+raiz(delta)/2*a
		x2 = (float) ((-(b)-Math.sqrt(delta))/(2*a)); // -b-raiz(delta)/2*a
		
		System.out.println("Raizes X1 = " + x1 +" X2 = " + x2);	
	}

}
