package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[3];
		float[] notas = new float[3];
		float media = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("Informe o nome do aluno " + (i + 1) + " : ");
			nomes[i] = teclado.next();
			System.out.print("Informe a nota do aluno " + (i + 1) + " : ");
			notas[i] = teclado.nextFloat();
			}
		media = (notas[0]+notas[1]+notas[2])/3;
		System.out.println("Media:"+media);
		}    
	}
