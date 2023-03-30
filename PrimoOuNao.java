package projetosbasicos;

import java.util.Scanner;

public class PrimoOuNao {
public static void  main(String[]args) {
	
	System.out.println("Esse sistema vai informar se o numero digitado e primo ou nao");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero inteiro de sua escolha: ");
	int numero = sc.nextInt();
	
	 boolean ehPrimo = true;
	// NUMERO PRIMO SO PODE SER DIVIDIDO POR 1 E POR ELE MESMO
     for (int i = 2; i <= numero / 2; i++) {	     
         if (numero % i == 0) {
             ehPrimo = false;
             break;
         }
     }

     if (ehPrimo) {
         System.out.println(numero + " e um numero primo");
     } else {
         System.out.println(numero + " nao e um numero primo");
     }
 }
	
}

