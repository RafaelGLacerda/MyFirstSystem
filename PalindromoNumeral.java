package projetosbasicos;

import java.util.Scanner;

public class palindromo {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um numero inteiro: ");
	        int numero = scanner.nextInt();

	        int numeroInvertido = 0;
	        int aux = numero;
	        while (aux > 0) {
	            int digito = aux % 10;
	            numeroInvertido = numeroInvertido * 10 + digito;
	            aux /= 10;
	        }

	        if (numero == numeroInvertido) {
	            System.out.println(numero + " e um numero palindromo");
	        } else {
	            System.out.println(numero + " nao e um numero palindromo");
	        }
	    }
	}
