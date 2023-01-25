package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x,y,z,media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de X:");
        x = teclado.nextFloat();
        System.out.println("Digite o valor de Y:");
        y = teclado.nextFloat();
        System.out.println("Digite o valor de Z:");
        z = teclado.nextFloat();
        
        media = (x+y+z)/3;
        System.out.println("Media: "+media);
	}

}
