class Animal {
    private String especie;
    private int idade;
    // outros atributos da classe Animal

    // construtor da classe Animal
    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
        // inicialização de outros atributos da classe Animal
    }

    // métodos get e set para os atributos da classe Animal
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // outros métodos da classe Animal
    // ...
}

class Peixe extends Animal {
    private String caracteristica;

    // array de características
    private String[] caracteristicas = {"Nadadeiras", "Escamas", "Respiração branquial"};

    // construtor da classe Peixe
    public Peixe(String especie, int idade, String caracteristica) {
        super(especie, idade);
        this.caracteristica = caracteristica;
    }

    // métodos get e set para o atributo caracteristica
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    // método dadosPeixe que imprime um relatório com os dados do peixe (incluindo os dados do Animal e a caracteristica)
    public void dadosPeixe() {
        System.out.println("Relatório do Peixe:");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Característica: " + caracteristica);
    }

    // método para exibir as características disponíveis
    public void exibirCaracteristicas() {
        System.out.println("Características disponíveis:");
        for (String caracteristica : caracteristicas) {
            System.out.println(caracteristica);
        }
    }
}
