package projetosbasicos;

import java.util.Scanner;

public class Delete2 {
    Scanner sc = new Scanner(System.in);
     
	String nome;
	int cpf;
	String datadenasc;
	
	
	void dadosDelete2() {
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("cpf: ");
		cpf = sc.nextInt();
		
		System.out.print("data de nascimento: ");
		datadenasc = sc.next();
		
		
		System.out.println();
		System.out.println();
		
		
	}

}
