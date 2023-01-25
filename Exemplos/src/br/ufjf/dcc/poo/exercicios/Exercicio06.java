package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distancia , tanque;
        int quilometroPorLitro;
        
        distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite a distancia:"));
        tanque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros do tanque:"));
        
        quilometroPorLitro = distancia/tanque;
        
        JOptionPane.showMessageDialog(null, "O consumo foi: "+quilometroPorLitro+" Km/L");
        
	}

}
