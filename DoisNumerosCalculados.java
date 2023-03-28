package projetosbasicos;

import java.util.Scanner;

public class DoisNumerosCalculados {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	double n1 = sc.nextDouble();

	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite outro numero: ");
	double n2 = sc1.nextDouble();
	
	double soma = n1+n2;
	double sub = n1-n2;
	double divi = n1/n2;
	double mult = n1*n2;
	
	System.out.println("Soma = " +soma);
	System.out.println("Subtracao = " +sub);
	System.out.println("divisao = " +divi);
	System.out.println("multiplicacao = " +mult);
