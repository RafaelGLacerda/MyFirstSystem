package projetosbasicos;

import java.util.Scanner;

public class MaiorEmenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de numeros (separados por virgula): ");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(",");

        double maior = Double.parseDouble(numerosStr[0]);
        double menor = Double.parseDouble(numerosStr[0]);

        for (int i = 1; i < numerosStr.length; i++) {
            double numero = Double.parseDouble(numerosStr[i]);
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
    }

	
	
