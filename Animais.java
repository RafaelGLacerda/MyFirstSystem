class animal{
    private String nome;
    private int idade;
    private String sexo;

    public animal(String nome, int idade, String sexo){
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
     return idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}
class TipoDoAnimal extends animal{
    private String tipo;
public TipoDoAnimal(String nome, int idade, String sexo, String tipo) {
super(nome, idade, sexo);    
this.tipo = tipo;
}

public String getTipo(){
    return tipo;
}


public void setTipo(String tipo){
    this.tipo = tipo;
}
}

public class Animais{
    public static void main(String[] args){

TipoDoAnimal animal1 = new TipoDoAnimal("Toto", 8, "Macho", "Cachorro");
TipoDoAnimal animal2 = new TipoDoAnimal("Amy", 4, "Femea", "Gato");
TipoDoAnimal animal3 = new TipoDoAnimal("Rutey", 1, "Macho", "Hamster");


System.out.println("Animal 1: " + animal1.getNome() + " Idade: " + animal1.getIdade() + " Sexo: " + animal1.getSexo() + " Tipo: " + animal1.getTipo());
System.out.println();
System.out.println("Animal 2: " + animal2.getNome() + " Idade: " + animal2.getIdade() + " Sexo: " + animal2.getSexo() + " Tipo: " + animal2.getTipo());
System.out.println();
System.out.println("Animal 3: " + animal3.getNome() + " Idade: " + animal3.getIdade() + " Sexo: " + animal3.getSexo() + " Tipo: " + animal3.getTipo());


    }
}
