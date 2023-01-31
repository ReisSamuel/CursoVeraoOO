package br.ufjf.dcc.poo.exercicio21;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Samuel","20818424",6.5,7.0,5.5,0.0));
		for(Aluno a : alunos) {
			a.media();
			System.out.println(a.resultadoFinal());
		}
		
	}

}
