package projetosbasicos;

import java.util.Scanner;

public class MathMath {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Determine um valor para 'x': ");
	double x = sc.nextDouble();
	
	System.out.print("Determine um valor para 'y': ");
	double y = sc.nextDouble();
	
	System.out.println();
	
	System.out.println("Maior valor entre x e y: " + Math.max(x,y));
	
	System.out.println();
	
	System.out.println("Menor valor entre x e y: " + Math.min(x,y));
	
	System.out.println();
	
	System.out.println("Valor Absoluto de y: " + Math.abs(x));
	
	System.out.println();
	
	System.out.println("Hipotenusa de x e y: " + Math.hypot(x,y));
	
	System.out.println();
	
	System.out.println("Raiz quadrada de x: " + Math.sqrt(x));
	
	System.out.println();
	
	System.out.println("x elevado a y: " + Math.pow(x,y));
	
	System.out.println();
	
	System.out.println("Numero aleatorio gerado: " + Math.random());
	
	System.out.println();
	
	System.out.println("Valor de PI: " + Math.PI);
	
	System.out.println();
	
	System.out.println("Seno de 90 graus: " + Math.sin(Math.PI/2));

	
	
	
}
}
