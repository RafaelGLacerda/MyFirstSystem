package projetosbasicos;

import java.util.Scanner;

public class ParOuImpar {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um numero inteiro: ");
	        int numero = scanner.nextInt();
                 
		    
		// SE O NUMERO FOR DIVISOR DE 2 = 0 ENTÃO ELE É PAR    
	        if (numero % 2 == 0) {
	            System.out.println("O numero " + numero + " e par.");
	        } else {
	            System.out.println("O numero " + numero + " e ímpar.");
	        }
	    }
	}
