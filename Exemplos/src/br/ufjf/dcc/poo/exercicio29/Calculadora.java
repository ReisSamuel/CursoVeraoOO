package br.ufjf.dcc.poo.exercicio29;


import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1 = 0;
		float num2 = 0;
		String operacao;
		
		try {
			num1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro valor:"));
			num2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo valor:"));
			operacao = JOptionPane.showInputDialog("Entre com a operacao:");
			if(operacao.equals("SOM")) {
				JOptionPane.showMessageDialog(null, num1+num2);
			}else if(operacao.equals("SUB")) {
				JOptionPane.showMessageDialog(null, num1-num2);
			}else if(operacao.equals("MUL")) {
				JOptionPane.showMessageDialog(null, num1*num2);
			}else if(operacao.equals("DIV")) {
				JOptionPane.showMessageDialog(null, num1/num2);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Ocorreu um erro de formato de numero ","Erro",0,null);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro de divisao por 0 ","Erro",0,null);
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			JOptionPane.showMessageDialog(null, "Programa concluido","Conclusao",0,null);
		}

	}

}
