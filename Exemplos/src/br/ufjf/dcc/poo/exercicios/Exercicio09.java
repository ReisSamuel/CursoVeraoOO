package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) { /// Pra saber se o triangulo existe
		// TODO Auto-generated method stub
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: ")); // 3
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));	// 4
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: ")); // 5
		
		if((Math.abs(b-c)< a && a < (b + c)) && (Math.abs(a-c)< b && b < (a + c)) && (Math.abs(a-b)< c && c < (a + b))) {
			JOptionPane.showMessageDialog(null, "Esse triangulo existe!");
		}else {
			JOptionPane.showMessageDialog(null, "Esse triangulo nao existe!");
		}
	}

}
