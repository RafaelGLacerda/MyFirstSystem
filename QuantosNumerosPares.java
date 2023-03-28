package projetosbasicos;

import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int n1 = sc.nextInt();
		        for (int i = 0; i <= n1; i += 2) {
		            System.out.println(i);
		        }
		    }
		}
