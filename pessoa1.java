import java.util.Scanner;

public class pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = input.next().charAt(0);

        pessoa pessoa1 = new pessoa(nome, idade, sexo);
        pessoa1.exibirInformacoes();
    }
}
