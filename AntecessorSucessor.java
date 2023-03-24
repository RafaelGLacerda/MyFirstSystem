package projetosbasicos;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        System.out.println("O antecessor: " + antecessor);
        System.out.println("O sucessor:  " + sucessor);
        
        sc.close();
    }
}
