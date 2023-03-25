package projetosbasicos;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do investimento: ");
        double valor = sc.nextDouble();

        System.out.println("Digite a taxa de juros anual (em %): ");
        double taxa = sc.nextDouble() / 100;

        System.out.println("Digite o periodo de tempo em anos: ");
        int anos = sc.nextInt();

        double valorFinal = valor * Math.pow(1 + taxa, anos);

        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
    }
}
