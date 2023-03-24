package projetosbasicos;

import java.util.Scanner;

public class Real_Dolar_Conversor {
public static void main(String[] args) {
	
	double real;
	double dolar;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o valor do Real Atualmente: ");
	dolar = sc.nextDouble();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Informe quantos reais voce quer converter: ");
	real = sc2.nextDouble();
	
	
	double resultado = real/dolar;
	
	System.out.println("Resultado em dolares: $" + resultado);
	
	
	

	
}
}
