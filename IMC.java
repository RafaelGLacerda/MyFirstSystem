package projetosbasicos;

import java.util.Scanner;

public class IMC {
public static void main(String[] args) {
	
	double altura, peso;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite aqui seu peso: Ex: (70,5): ");
	peso = sc.nextDouble();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Digite aqui sua altura: Ex: (1,75): ");
	altura = sc2.nextDouble();
	
	double IMC = (peso) / Math. pow(altura, 2);
	
	System.out.println(IMC);
	
    if(IMC<=18.5) {
    	System.out.println("Abaixo do peso");
    }
	if((IMC>=18.6) && (IMC<=25)) {
		System.out.println("Peso normal");
	}
	if((IMC>=25.) && (IMC<=30)) {
		System.out.println("Sobrepeso");
	}
		if(IMC>31) {
			System.out.println("Obeso");
		} 
			
	
}
}
