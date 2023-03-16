package projetosbasicos;

import java.util.Scanner;

public class SistemaDeTabuadas {

public static void main(String[] args) {
	
	Scanner operacao = new Scanner(System.in);
	int continuar;
do {
		int n, cont = 0, r;
		
		System.out.print("Digite o numero que quer calcular na tabuada: ");
		n = operacao.nextInt();
	
		while (cont <= 10) {
			r = n* cont;
			System.out.println(n + "X" +cont+ "=" + r);
			cont ++;
			
			
		}

        System.out.println("Continuar? (1)Sim 2(Nao): ");
		continuar = operacao.nextInt();
		
}	while (continuar == 1);
			
  
} 
}
