package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1Dialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nome;
        nome = JOptionPane.showInputDialog("Digite o nome do Usuario");
        JOptionPane.showMessageDialog(null, "Ola, "+nome+"!");
	}

}
