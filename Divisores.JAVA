package projetosbasicos;

import java.util.Scanner;

public class Divisores {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite um numero inteiro: ");
	        int numero = sc.nextInt();
	        
	        System.out.print("Divisores de " + numero + ": ");
	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        
	        
	    }
	}
