package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da semana"));
        
        if(dia == 1) {
        	JOptionPane.showMessageDialog(null, "1 - domingo");
        }else if(dia == 2) {
        	JOptionPane.showMessageDialog(null, "2 - segunda");
        }else if(dia == 3) {
        	JOptionPane.showMessageDialog(null, "3 - terça");
        }else if(dia == 4) {
        	JOptionPane.showMessageDialog(null, "4 - quarta");
        }else if(dia == 5) {
        	JOptionPane.showMessageDialog(null, "5 - quinta");
        }else if(dia == 6) {
        	JOptionPane.showMessageDialog(null, "6 - sexta");
        }else if(dia == 7) {
        	JOptionPane.showMessageDialog(null, "7 - sabado");
        }
        
	}

}
