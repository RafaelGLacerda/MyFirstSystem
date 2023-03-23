package projetosbasicos;

import java.util.Scanner;

public class Hipotenusa {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui o numero do Lado1: ");
	double n1 = sc.nextDouble();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite aqui o numero do Lado2: ");
	double n2 = sc1.nextDouble();
	
	double soma = n1+n2;
	double resultado = Math. sqrt(soma);
	
	System.out.println(resultado);

	
}
}
