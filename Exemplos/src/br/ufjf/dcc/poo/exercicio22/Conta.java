package br.ufjf.dcc.poo.exercicio22;

public class Conta {
     private String nome;
     private int numero;
     private String agencia;
     private double saldo;
     private String data;
	
     public Conta(String nome, int numero, String agencia, double saldo, String data) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.data = data;
	}
     
     public void saca(double valor) {
    	 this.saldo -=valor;
    	 System.out.println("R$"+valor);
     }
     
     public void deposita(double valor) {
    	 this.saldo +=valor;
    	 System.out.println("R$"+valor);
     }
     
     public double calculaRendimento() {
    	 
    	 return saldo*0.1;
     }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
       
}
