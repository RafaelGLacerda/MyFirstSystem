package projetosbasicos;

import java.util.Scanner;

public class ElevarNumeros {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui um numero(Base): ");
	double n1 = sc.nextDouble();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite aqui o valor do expoente: ");
	double n2 = sc1.nextDouble();
	
	double resultado = Math. pow(n1, n2);
	System.out.println(resultado);
	
	
}
}
