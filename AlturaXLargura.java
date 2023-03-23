package projetosbasicos;

import java.util.Scanner;

public class AlturaXLargura {
	public static void main(String[]args) {
	  Scanner scanner = new Scanner(System.in);

      
      System.out.print("Digite a largura do terreno (em metros): ");
      double largura = scanner.nextDouble();

      System.out.print("Digite a altura do terreno (em metros): ");
      double altura = scanner.nextDouble();

    
      double area = largura * altura;

      
      System.out.println("A área do terreno é de " + area + " metros quadrados.");
  }
}
