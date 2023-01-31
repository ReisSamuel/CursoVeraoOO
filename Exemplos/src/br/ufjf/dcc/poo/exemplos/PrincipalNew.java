package br.ufjf.dcc.poo.exemplos;


public class PrincipalNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PessoaNew p1 = new PessoaNew();
        p1.nome = "Joao";
        p1.idade = 21;
        
        PessoaNew p2 = new PessoaNew();
        p2.nome = "Alice";
        p2.idade = 34;
        
        System.out.println("Pessoa: ");
        System.out.println("O nome da pessoa 1 eh: "+p1.nome);
        System.out.println("A idade da pessoa 1 eh: "+p1.idade);
        System.out.println("O nome da pessoa 2 eh: "+p2.nome);
        System.out.println("A idade da pessoa 1 eh: "+p2.idade);
        
       // List<PessoaNew> pessoas;
	}

}
