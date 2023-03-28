package projetosbasicos;

import java.util.Scanner;

public class PrimeiraLetra {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite uma frase: ");
	        String frase = scanner.nextLine();

	        String[] palavras = frase.split(" ");

	        System.out.print("As primeiras letras de cada palavra sao: ");
	        for (String palavra : palavras) {
	            System.out.print(palavra.charAt(0) + " ");
	        }
	    }
	}
