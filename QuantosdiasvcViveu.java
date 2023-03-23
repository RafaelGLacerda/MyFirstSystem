package projetosbasicos;

import java.util.Scanner;

public class Quantos_Dias_Voce_viveu {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite aqui sua idade: ");
	int idade = sc.nextInt();
	
	int Resultado = idade*365;
	System.out.println(Resultado);
	}
}
