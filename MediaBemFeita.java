package projetosbasicos;

import java.util.Scanner;

public class MediaIncrivel {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite uma lista de numeros inteiros separados por virgula: ");
	        String numerosString = scanner.nextLine();

	        String[] numeros = numerosString.split(",");
	        int soma = 0;

	        for (String numero : numeros) {
	            soma += Integer.parseInt(numero.trim());
	        }

	        double media = (double) soma / numeros.length;
	        System.out.println("A media dos numeros e: " + media);
	    }
	}
