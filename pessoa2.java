import java.util.Scanner;

public class pessoaChatGpt {
    private String nome;
    private int idade;
    private char sexo;

    public pessoaChatGpt(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

}
