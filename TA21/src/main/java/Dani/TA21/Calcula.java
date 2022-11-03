package Dani.TA21;

import javax.swing.JTextField;

public class Calcula {

	private String raizcuadrada(String op1) {
		// TODO Auto-generated method stub
		double resultado=0;
		try {
			resultado= Math.sqrt(Double.parseDouble(op1));
			return (""+resultado);
		}catch(ArithmeticException e) {
			return ("Operacion no válida");
		}
		
	}

	private String potencia(String op1, String string) {
		// TODO Auto-generated method stub
		double resultado=0;
		resultado= Math.pow(Double.parseDouble(op1),Double.parseDouble(string));
		return (""+resultado);
		
	}

	private String division(String op1, String op2) {
		// TODO Auto-generated method stub
		double resultado=0;
		if(op2.equals("0")) return ("Operacion no válida");
		else {
			resultado= Double.parseDouble(op1)/ Double.parseDouble(op2);
			return (""+resultado);
		}
		
	}

	private String multiplicacion(String op1, String op2) {
		// TODO Auto-generated method stub
		double resultado= Double.parseDouble(op1)* Double.parseDouble(op2);
		return (""+resultado);
		
	}

	private String resta(String op1, String op2) {
		// TODO Auto-generated method stub
		double resultado= Double.parseDouble(op1)- Double.parseDouble(op2);
		return (""+resultado);
		
	}

	private String suma(String op1, String op2) {
		// TODO Auto-generated method stub
		double resultado= Double.parseDouble(op1)+ Double.parseDouble(op2);
		return (""+resultado);
		
	}

	public String calculaResultado(String text) {
		
		String texto= text,op1="",op2="",resultado = "";
		char[] letras= texto.toCharArray();
		int i=0;
		while(Character.isDigit(letras[i]) || letras[i]=='.') {
			i++;
		}
		
		for(int j=0;j<letras.length;j++) {
			if(j<i) op1+=letras[j];
			if(j>i) op2+=letras[j];
		}
		switch(letras[i]) {
			case '+':
				resultado=suma(op1,op2);
				break;
			case '-':
				resultado=resta(op1,op2);
				break;
			case 'x':
				resultado=multiplicacion(op1,op2);
				break;
			case '/':
				resultado=division(op1,op2);
				break;
			case '²':
				resultado=potencia(op1,"2");
				break;
			case '√':
				resultado=raizcuadrada(op2);
				break;
			default:
				break;
		}
		return resultado;
		
	}

}
