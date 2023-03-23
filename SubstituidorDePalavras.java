package projetosbasicos;

import java.util.Scanner;

public class substituidor_de_palavras {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

    
    System.out.print("Digite uma frase: ");
    String frase = scanner.nextLine();

    
    System.out.print("Digite a palavra que deseja substituir: ");
    String palavraAntiga = scanner.nextLine();

    
    System.out.print("Digite a nova palavra: ");
    String palavraNova = scanner.nextLine();

    
    String novaFrase = frase.replace(palavraAntiga, palavraNova);

    
    System.out.println("Nova frase: " + novaFrase);
    
    
}
}
