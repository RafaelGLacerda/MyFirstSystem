package projetosbasicos;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        BigInteger resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " e: " + resultado);
    }

    public static BigInteger calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        return fatorial;
    }
}
