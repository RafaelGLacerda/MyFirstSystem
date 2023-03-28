package projetosbasicos;

import java.util.Scanner;

public class MenorEMaior {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	double n1 = sc.nextDouble();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	double n2 = sc1.nextDouble();
	
	if(n1>n2) {
		System.out.println("Maior = "+n1+ ", Menor = " +n2);
	}else
		System.out.println("Maior = "+n2+ ", Menor = " +n1);
	

	
}
}
