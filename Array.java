package projetosbasicos;

import java.util.Scanner;

public class array {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o tamanho do array: ");
	        int tamanho = input.nextInt();

	        int[] numeros = new int[tamanho];

	        for (int i = 0; i < tamanho; i++) {
	            System.out.print("Digite o " + (i + 1) + " numero: ");
	            numeros[i] = input.nextInt();
	        }

	        int somaPar = 0;
	        int somaImpar = 0;

	        for (int numero : numeros) {
			// SE O NUMERO FOR DIVISOR DE 2 = 0 ENTÃO ELE É PAR  
	            if (numero % 2 == 0) {
	                somaPar += numero;
	            } else {
	                somaImpar += numero;
	            }
	        }

	        System.out.println("A soma dos numeros pares e: " + somaPar);
	        System.out.println("A soma dos numeros impares e: " + somaImpar);
	    }
	}
