package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag, maiores = 0;
	      Scanner teclado = new Scanner(System.in);
	      
	      System.out.println("Digite uma idade");
	      flag = teclado.nextInt();
	      while(flag != -1) {
	    	  if(flag >= 18  && flag != -1) {
	    		  maiores++;
	    	  }
	    	  System.out.println("Digite uma idade");
	          flag = teclado.nextInt();
	      }
	      System.out.println("Qnt de maiores de idade = "+maiores);
		}
	}
