package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int soma = 0, contador = 0;
        int flag = 0;
        float media;
        flag = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        while(flag != -1) {
        	soma += flag;
        	contador++;
        	flag = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }
        media = soma/contador;
        JOptionPane.showMessageDialog(null,"Media: " + media);
	}

}
