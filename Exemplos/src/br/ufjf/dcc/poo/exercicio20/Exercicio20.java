package br.ufjf.dcc.poo.exercicio20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		/*
		 * Pessoa p1 = new Pessoa("Zé",35); Pessoa p2 = new Pessoa("Ana",42,"F");
		 * 
		 * Pessoa p3 = new Pessoa(); p3.setNome("Jorge"); p3.setIdade(37);
		 * p3.setSexo("M"); p3.setCpf("001.345.654-76");
		 */
		
		List<Pessoa> pessoas = new ArrayList<>(); // ou ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); 
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i<3;i++) {
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome da Pessoa "+(i+1)+":");
			p.setNome(teclado.next());
            System.out.println("Digite a idade da Pessoa "+(i+1)+":");
			p.setIdade(teclado.nextInt());
			System.out.println("Digite o sexo da Pessoa "+(i+1)+":");
			p.setSexo(teclado.next());
		    System.out.println("Digite o cpf da Pessoa "+(i+1)+":");
		    p.setCpf(teclado.next());
		    pessoas.add(p);
		}
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}	
		teclado.close();
	}    
}
