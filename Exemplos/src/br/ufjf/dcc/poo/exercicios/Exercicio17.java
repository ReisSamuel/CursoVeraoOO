package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int flag, impares = 0;
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Digite um valor");
      flag = teclado.nextInt();
      while(flag != -1) {
    	  if(flag % 2 != 0 && flag != -1) {
    		  impares++;
    	  }
    	  System.out.println("Digite um valor");
          flag = teclado.nextInt();
      }
      System.out.println("Impares = "+impares);
	}

}
