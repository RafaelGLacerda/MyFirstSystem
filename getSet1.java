package projetosbasicos;

import java.util.Scanner;

public class getSet1 {
public static void main(String[] args) {
	
	String Time;
	String Selecao;
	
	Scanner sc = new Scanner(System.in);
	
    getset2 basic = new getset2();
    
    System.out.println("Qual time voce torce? ");
	Time = sc.nextLine();
	
	System.out.println("Qual selecao voce torce? ");
	Selecao = sc.nextLine();
	
	
	System.out.println();
	
	basic.setTime(Time);
	basic.mostrarTime();
	
	System.out.println();
	
	basic.SetSelecao(Selecao);
	basic.mostrarSelecao();
	
	
}
}
