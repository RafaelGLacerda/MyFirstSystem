import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
       
        String[] nomes = {"João", "Maria", "José", "Ana"};
        String[] telefones = {"(11) 1234-5678", "(11) 2345-6789", "(11) 3456-7890", "(11) 4567-8901"};
        String[] emails = {"joao@gmail.com", "maria@gmail.com", "jose@gmail.com", "ana@gmail.com"};

        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Nomes disponíveis:");
        for (String nome : nomes) {
            System.out.println("- " + nome);
        }

        
        System.out.print("Digite o nome desejado: ");
        String nomeEscolhido = scanner.nextLine();

       
        int indice = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeEscolhido)) {
                indice = i;
                break;
            }
        }

       
        if (indice == -1) {
            System.out.println("Nome não encontrado.");
        } else {
           
            System.out.println("Telefone: " + telefones[indice]);
            System.out.println("Email: " + emails[indice]);
        }
    }
}
