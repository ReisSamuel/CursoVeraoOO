package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numeroSorteado, numeroDigitado;
        
        numeroSorteado = (int)(Math.random() *100);
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o valor sorteado:"));
        
        if(numeroDigitado < numeroSorteado) {
        	JOptionPane.showMessageDialog(null, "O numero digitado eh menor que o sorteado: "+numeroSorteado);
        } else if(numeroDigitado > numeroSorteado) {
        	JOptionPane.showMessageDialog(null, "O numero digitado eh maior que o sorteado: "+numeroSorteado);
        }else {
            	JOptionPane.showMessageDialog(null, "Acertou! O numero digitado eh igual ao sorteado: "+numeroSorteado);
        }
	}

}
