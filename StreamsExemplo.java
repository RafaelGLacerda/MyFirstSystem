import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsExemplo{
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa("João", 25, Genero.MASCULINO));
        pessoas.add(new Pessoa("Maria", 30, Genero.FEMININO));
        pessoas.add(new Pessoa("Pedro", 20, Genero.MASCULINO));
        pessoas.add(new Pessoa("Ana", 28, Genero.FEMININO));
        pessoas.add(new Pessoa("Lucas", 35, Genero.MASCULINO));
        pessoas.add(new Pessoa("Julia", 22, Genero.FEMININO));
        
        // Filtrando apenas as pessoas do gênero masculino
        pessoas.stream()
               .filter(p -> p.getGenero() == Genero.MASCULINO)
               // Ordenando por idade
               .sorted(Comparator.comparing(Pessoa::getIdade))
               // Imprimindo o nome e idade de cada pessoa
               .forEach(p -> System.out.println(p.getNome() + " - " + p.getIdade()));
    }
    
}

enum Genero {
    MASCULINO, FEMININO;
}

class Pessoa {
    
    private String nome;
    private int idade;
    private Genero genero;
    
    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }
    
}
