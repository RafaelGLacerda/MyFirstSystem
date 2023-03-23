package projetosbasicos;

import java.util.Scanner;

public class Quantidade_de_caracteres {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner1 = new Scanner(System.in);

	        System.out.print("Digite um texto: ");
	        String texto = scanner1.nextLine();

	        int quantidadeCaracteres = texto.length();

	        System.out.println("O texto digitado possui " + quantidadeCaracteres + " caracteres.");
	    }
	}
