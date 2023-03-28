package projetosbasicos;

import java.util.Scanner;

public class SomaDosNumeroPares {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um numero inteiro: ");
		        int numero = scanner.nextInt();

		        int soma = 0;
		        for (int i = 2; i <= numero; i += 2) {
		            soma += i;
		        }

		        System.out.println("A soma dos numeros pares ate " + numero + " e " + soma);
		    }
		


	}
