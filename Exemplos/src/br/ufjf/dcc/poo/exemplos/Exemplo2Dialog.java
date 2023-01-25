package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,soma;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		soma = x+y;
        JOptionPane.showMessageDialog(null,"Resultado da soma entre "+ x + " e "+ y +": " + soma);
	}

}
