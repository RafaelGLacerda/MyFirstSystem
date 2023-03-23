package projetosbasicos;

import java.util.Scanner;

public class media {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui um numero: ");
	int n1 = sc.nextInt();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite aqui outro numero: ");
	int n2 = sc1.nextInt();
	
	int resultado = (n1+n2)/2;
	System.out.println(resultado);
	
	
}
}
