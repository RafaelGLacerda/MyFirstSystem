package projetosbasicos;

import java.util.Scanner;

public class SobrecargaPrincipal {
public static void main(String[] args) {
	
	double x, y;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Escolha o valor para 'x': ");
	x = sc.nextDouble();
	
	System.out.print("Escolha o valor para 'y': ");
	y = sc.nextDouble();
	
	System.out.println();
	System.out.println();
	
	System.out.printf("O quadrado de %.2f e: %.2f\n", x, SobrecargaSecundario.elevar(x));
	
	System.out.printf("%.2f elevado a %.2f e: %.2f\n", x, y, SobrecargaSecundario.elevar(x,y));
	
	
}
}
