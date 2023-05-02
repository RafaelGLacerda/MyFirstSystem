import java.util.Scanner;

class Pessoa{
    Scanner sc = new Scanner(System.in);
String nome;
int idade;
String profissão;
String sub;

public Pessoa(String nome, String profissão, int idade, String sub){
    this.nome = nome;
    this.idade = idade;
    this.profissão = profissão;
    this.sub = sub;
}
public String getProf(){
    return profissão;
}
public int getIdade(){
    return idade;
}
public String getNome(){
    return nome;
}
public void fazerAniversario(){
    idade++;
}
public void trocarProfissão(){
    System.out.println("Digite o nome da profissão que deseja substituir: ");
    sub = sc.nextLine();
}
}
public class Aniversario{
public static void main(String[] args){

    Pessoa p1 = new Pessoa("João thungs", "Comerciante", 29, "");
    Pessoa p2 = new Pessoa("John Klein Flinstons", "Policial", 33, "");

    System.out.println("Pessoa 1: " + "Nome: " + p1.getNome() + ", Profissão: " + p1.getProf() + ", Idade: " + p1.getIdade());
    p1.trocarProfissão();
    System.out.println("Profissão alterada: " + p1.sub);
    System.out.println("Dados atualizados: " + "Nome: " + p1.getNome() + ", Profissão: " + p1.sub + ", Idade: " + p1.getIdade());
    p1.fazerAniversario();
    System.out.println("Idade após aniversario: " + p1.getIdade());
    
    System.out.println();

    System.out.println("Pessoa 2: " + "Nome: " + p2.getNome() + ", Profissão: " + p2.getProf() + ", Idade: " + p2.getIdade());
    p1.trocarProfissão();
    System.out.println("Profissão alterada: " + p1.sub);
    System.out.println("Dados atualizados: " + "Nome: " + p2.getNome() + ", Profissão: " + p2.sub + ", Idade: " + p2.getIdade());
    p2.fazerAniversario();
    System.out.println("Idade após aniversario: " + p2.getIdade());

}
}
