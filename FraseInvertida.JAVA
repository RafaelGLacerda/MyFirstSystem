package projetosbasicos;

import java.util.Scanner;

public class InvertidoString {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite uma frase ou palavra: ");
	        String texto = scanner.nextLine();

	        String textoInvertido = "";
	        for (int i = texto.length() - 1; i >= 0; i--) {
	            textoInvertido += texto.charAt(i);
	        }

	        System.out.println("A string invertida e: " + textoInvertido);
	    }
	}
