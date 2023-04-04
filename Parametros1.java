package projetosbasicos;

import java.util.Scanner;

public class Parametros1 {
public static void main(String[] args) {
	
	String nome;
	int idade;
	
	Scanner sc = new Scanner(System.in);
	
	parametros2 facil = new parametros2();
	
	System.out.print("Digite seu nome e sobrenome: ");
	nome = sc.nextLine();
	
	facil.mensagem(nome);
	
	System.out.println();
	System.out.println();
	
	System.out.println("Informe aqui sua idade: ");
	idade = sc.nextInt();
	
	facil.mensagem2(nome, idade);
}
}
