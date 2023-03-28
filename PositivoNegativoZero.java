package projetosbasicos;

import java.util.Scanner;

public class PositivoNegativoZero {
	
public static void main(String[] args) {
	
	System.out.println("Esse sistema informa se o seu numero e: positivo, negativo ou zero");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui o numero de sua escolha: ");
	double numero = sc.nextDouble();
	
	if(numero>=0.1) {
		System.out.println("Positivo");
	}
	if(numero==0) {
         System.out.println("Zero");
	}
	if(numero<=-1) {
		System.out.println("Negativo");
	}
	

}
}
