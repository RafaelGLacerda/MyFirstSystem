package projetosbasicos;

import java.util.Scanner;

public class numerosPositivosNegativos {
public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("coloque um numero: ");
	int posi = scan.nextInt();
	
	Scanner scan2 = new Scanner(System.in);
	System.out.print("coloque um numero: ");
	int posi2 = scan2.nextInt();
	
	Scanner scan3 = new Scanner(System.in);
	System.out.print("coloque um numero: ");
	int posi3 = scan3.nextInt();
	
	Scanner scan4 = new Scanner(System.in);
	System.out.print("coloque um numero: ");
	int posi4 = scan4.nextInt();
	
	
	if ((posi < posi2) && (posi < posi3) && (posi < posi4)) {
		System.out.print("O numero menor e: "+ posi);
	}
	if ((posi2 < posi) && (posi2 < posi3) && (posi2 < posi4)) {
		System.out.print("O numero menor e: "+ posi2);
	}
	if ((posi3 < posi) && (posi3 < posi2) && (posi3 < posi4)) {
		System.out.print("O numero menor e: "+ posi3);
	}
	if ((posi4 < posi) && (posi4 < posi2) && (posi4 < posi3)) {
		System.out.print("O numero menor e: "+ posi4);
	}
	

}
}
