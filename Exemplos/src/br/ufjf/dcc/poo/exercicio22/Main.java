package br.ufjf.dcc.poo.exercicio22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Conta c1 = new Conta("Samuel", 2258741, "16", 200, "30/01/2023");
	
       System.out.println("Saldo: "+c1.getSaldo());
       System.out.print("Foi sacado: ");
       c1.saca(20);
       System.out.println("Saldo Atual: "+c1.getSaldo());
       System.out.print("Foi depositado: ");
       c1.deposita(50);
       System.out.println("Saldo Atual: "+c1.getSaldo());
       System.out.println("Rendimento mensal dessa conta eh: "+c1.calculaRendimento());
	}

}
