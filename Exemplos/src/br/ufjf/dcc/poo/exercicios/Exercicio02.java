package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		float lt,pt,lc,pc,areat,areac,areaR;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a Largura do terreno: "); //Largura do Terreno
		lt = teclado.nextFloat();
		System.out.println("Digite a Profundidade do terreno: "); //Profundidade do Terreno
		pt = teclado.nextFloat();
		areat = lt*pt;	//Area do Terreno
		
		System.out.println("Digite a Largura da casa: "); //Largura da Casa 
		lc = teclado.nextFloat();
		System.out.println("Digite a Profundidade da casa: "); //Profundidade da Casa 
		pc = teclado.nextFloat();
		areac = lc*pc; //Area da Casa
		
		areaR = areat - areac; //Area Restante (Valor absoluto)
		
		System.out.println("Area Terreno: "+ areat);
		System.out.println("Area Casa: "+ areac);
		System.out.println("Area Disponivel: "+ ((areaR/areat)*100) + "%"); //Area Restante (Valor em porcentagem)
		
	}
}
