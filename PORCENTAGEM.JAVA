package projetosbasicos;

import java.util.Scanner;

public class UmPorcentoDeReajuste {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe seu saldo: ");
    double saldo = sc.nextDouble();
    
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Quantos porcento voce deseja acrecentar, Digite: Ex: - 10 porcento = (0,1) - 1 porcento = (0,01): ");
    double porcentagem = sc2.nextDouble();
    
    double calculo = saldo*porcentagem;
    double resultado = calculo + saldo;
    
   System.out.println("Seu saldo apos o aumento de porcentagem e: " + resultado);
    
	
	

}
}
