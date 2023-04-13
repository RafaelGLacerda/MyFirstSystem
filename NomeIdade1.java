import java.util.Scanner;

public class nomeidade1 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas:  ");
        int numPessoas = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha deixada pelo nextInt()
        
        nomeidade2[] pessoas = new nomeidade2[numPessoas];
        
        for (int i = 0; i < numPessoas; i++) {

            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // consome a quebra de linha deixada pelo nextInt()
            
            pessoas[i] = new nomeidade2(nome, idade);
        }
        
        nomeidade2 pessoaMaisVelha = nomeidade2.maiorIdade(pessoas);
        
        System.out.println("A pessoa mais velha é " + pessoaMaisVelha.getNome() + " com " + pessoaMaisVelha.getIdade() + " anos.");
    }
}
