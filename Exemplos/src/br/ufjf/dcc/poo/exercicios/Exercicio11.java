package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto"));
		float valorAnterior = valor;
		
		if(valor <= 2) {
		  valor += 0.15;	
		}else if(valor > 2 && valor < 5) {
			valor *= 0.02;
		}else if(valor > 5 && valor < 20) {
			valor *= 0.1;
		}else if(valor > 20) {
			valor *= 0.08;
		}
        JOptionPane.showMessageDialog(null,"Um produto que custa R$"+valorAnterior+", tera um acrescimo de "+valor);
	}

}
