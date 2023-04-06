import java.util.Scanner;

public class pessoa1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = input.next().charAt(0);

        pessoa1 facil = new pessoa1(nome, idade, sexo);
        facil.exibirInformacoes();

    }
    }
