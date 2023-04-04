package projetosbasicos;

import java.util.Scanner;

public class Orientacao_a_Objetos1 {
	
public static void main(String[] args) {
	
	// LIVRO
	
	Scanner sc1 = new Scanner (System.in);
	
	Orientacao_a_Objetos2 Livro = new Orientacao_a_Objetos2();
	
	System.out.println("Nome do livro: ");
	Livro.titulo = sc1.nextLine();
	
	System.out.println("Autor do Livro: ");
	Livro.autor = sc1.nextLine();
	
	System.out.println("Descricao do Livro: ");
	Livro.descricao = sc1.nextLine();
	
	System.out.println("Data da publicacao do Livro: ");
	Livro.datapub = sc1.nextLine();
	
	System.out.print("Preco do Livro: R$ ");
	Livro.preco = sc1.nextDouble();	
	
	//SÓ PARA DAR ESPAÇO, INUTIL
	System.out.println();
	System.out.println();
	
	System.out.println("Nome: " +Livro.titulo);
	System.out.println("Autor: " +Livro.autor);
	System.out.println("Descricao: " +Livro.descricao);
	System.out.println("data de publicacao: " +Livro.datapub);
	System.out.println("preco: R$ " +Livro.preco);

}
}
