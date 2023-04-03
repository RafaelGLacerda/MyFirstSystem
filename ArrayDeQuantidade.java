package projetosbasicos;

import java.util.Scanner;

public class ArrayBasico {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o tamanho do array: ");
	int tamanho = sc.nextInt();
	int[] num = new int[tamanho];
	
	for (int i = 0; i < tamanho; i++) {
		System.out.printf("Digite o " + (1+i) + ":");
		num[i] = sc.nextInt();
		
	}
	int soma = 0;
	
	for (int numero : num) {
		soma++;
	}
	
	System.out.print(soma);

}
}
