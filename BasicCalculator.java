package projetosbasicos;

import java.util.Scanner;

public class calculadoraBasica {
	
public static void main(String[] args) {
	
	Scanner calculadora = new Scanner(System.in);
	int continuar;
	do {
		System.out.println("Digite um numero: ");
		double n1 = calculadora.nextDouble();
		
		System.out.println("Digite um numero: ");
		double n2 = calculadora.nextDouble();
		
		System.out.println("Digite a operacao: (+, -, *, /): ");
		char op = calculadora.next().charAt(0);
		
		double resultado;
		switch (op) {
		
		case '+':
			resultado = n1 + n2;
			System.out.println("A soma e =" + resultado);
			break;
		case '-':
			resultado = n1 - n2;
			System.out.println("A Subtracao e =" + resultado);
			break;
		case '*':
			resultado = n1 * n2;
			System.out.println("A multiplicacao e =" + resultado);
			break;
		case '/':
			resultado = n1 / n2;
			System.out.println("A divisao e =" + resultado);
			break;
			
			default:
				System.out.println("operação invalida ");
				break;
		}
		System.out.print("continuar? (1)Sim 2()Nao: ");
		continuar = calculadora.nextInt();		
			
						
		}
	while (continuar == 1);
		
		
		
	}
	
	

}
