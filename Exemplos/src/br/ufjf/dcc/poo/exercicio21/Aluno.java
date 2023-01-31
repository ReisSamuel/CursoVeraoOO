package br.ufjf.dcc.poo.exercicio21;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaP1;
    private double notaP2;
    private double notaTrabalho;
    private double media;
    
    public Aluno() {
	}
 
    public Aluno(String nome, String matricula, double notaP1, double notaP2, double notaTrabalho, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaTrabalho = notaTrabalho;
		this.media = media;
	}
	
	public void media() {
		this.media = (notaP1+notaP2+notaTrabalho)/3;
	}
	
	public String resultadoFinal() {
		if(media >= 4 && media < 6) {
			//System.out.println();
			return "Prova Final!";
		}else if(media >= 6) {
			//System.out.println("Aprovado!");
			return "Aprovado!";	
		}else {
			//System.out.println();
			return "Reprovado";
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(float notaP1) {
		this.notaP1 = notaP1;
	}

	public double getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(float notaP2) {
		this.notaP2 = notaP2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notaP1=" + notaP1 + ", notaP2=" + notaP2
				+ ", notaTrabalho=" + notaTrabalho + ", media=" + media + "]";
	}
     
}
