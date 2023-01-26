package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int inicio,fim;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o valor inicial:");
       inicio = teclado.nextInt();
       System.out.println("Digite o valor final:");
       fim = teclado.nextInt();
       
       for(int i = inicio; i <= fim ; i++) {
    	   System.out.print(i+" ");
       }
	}

}
