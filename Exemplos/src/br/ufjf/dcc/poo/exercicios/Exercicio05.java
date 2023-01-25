package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 { //Distancia entre dois pontos

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		float x1,x2,y1,y2,dist;
		
		x1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de X1:")); // x1 = 2
		x2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de X2:")); // x2 = -3
		y1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Y1:")); // y1 = 1
		y2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de Y2:")); // y2 = -11
        
		dist = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));  // tem que dar 13
		JOptionPane.showMessageDialog(null, "Valor da distancia: "+dist);
	}

}
