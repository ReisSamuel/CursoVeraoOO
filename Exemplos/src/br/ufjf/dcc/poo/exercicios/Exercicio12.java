package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int vezes;
       vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes deverá repetir"));
       
       for(int i=0 ; i < vezes;i++) {
    	   //JOptionPane.showMessageDialog(null, "Faça os exercicios novamente. "+(i+1));
    	   System.out.println("Faça os exercicios novamente.");
       }
	}

}
