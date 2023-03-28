package projetosbasicos;

import java.util.Scanner;

public class QuantasVogaisPossui {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite uma frase: ");
	        String frase = sc.nextLine();
	        
	        int contadorVogais = 0;
	        for (int i = 0; i < frase.length(); i++) {
	            char letra = frase.charAt(i);
	            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
	                contadorVogais++;
	            }
	        }
	        
	        System.out.println("A frase digitada possui " + contadorVogais + " vogais.");
	        
	       
	    }
	}
