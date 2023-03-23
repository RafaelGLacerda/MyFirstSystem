package projetosbasicos;

import java.util.Scanner;

public class salariominimo {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);

  
    System.out.print("Digite o valor do salário mínimo: ");
    double salarioMinimo = scanner.nextDouble();

    
    System.out.print("Digite o valor do salário do funcionário: ");
    double salarioFuncionario = scanner.nextDouble();

    
    double quantidadeSalarios = salarioFuncionario / salarioMinimo;

    
    System.out.println("O funcionário ganha " + quantidadeSalarios + " salários mínimos.");
}
}
