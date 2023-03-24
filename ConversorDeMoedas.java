package projetosbasicos;

import java.util.Scanner;

public class ConversorDeMoedas {
public static void main(String[]args) {
	
	double real, quantia;
	int escolha;
	
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui o valor do Real Atualmente: ");
	real = sc.nextDouble();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite aqui a quantia que deseja converter: ");
	quantia = sc1.nextDouble();
	
	double ReDo = real*quantia;
	double DoRe = quantia/real;
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Escolha: (1) Dolar para Real,  (2) Real para dolar: ");
	escolha = sc2.nextInt();
	
	if(escolha==1) {
		System.out.println("Quantidade em Real: R$" + ReDo);
		
	}
	if(escolha==2) {
		System.out.println("Quantidade em Dolar: $" + DoRe);
		
	}
		
	
}
}
