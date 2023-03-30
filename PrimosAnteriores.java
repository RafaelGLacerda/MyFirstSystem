package projetosbasicos;

import java.util.Scanner;

public class PrimosAnteriores {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	int numero;
	System.out.println("Digite aqui um numero inteiro: ");
	numero = sc.nextInt();
	
	
	
	for (int i = 2; i <= numero; i++) {
	   boolean primo = true;
	
   
	for (int j = 2; j <= i / 2; j++) {
    if(i % j == 0) {
    	primo = false;
    	break;
    }
   
	
	}
	
	if(primo) {
	System.out.println(i);
	}
	
	
	}
	
  }
}
