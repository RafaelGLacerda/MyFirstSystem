package projetosbasicos;

import java.util.Scanner;

public class DivisivelPor3e5 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um numero inteiro: ");
	        int numero = scanner.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println(numero + " e divisivel por 3 e por 5");
	        } else {
	            System.out.println(numero + " nao e divisivel por 3 e por 5 ao mesmo tempo");
	        }
	    }
	}
