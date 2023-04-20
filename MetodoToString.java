class AlunoInfo {
    private String nome;
    private String curso;
    private String matricula;
    private int idade;
public AlunoInfo(String nome, String curso, String matricula, int idade){
    this.nome = nome;
    this.curso = curso;
    this.matricula = matricula;
    this.idade = idade;
}
public String toString(){
return "Informações do aluno: " + " Nome: " + nome + ", Idade: " + idade + ", matricula: "+ matricula + ", curso: " + curso;
}
}
public class Aluno{

    public static void main(String[] args){

    AlunoInfo Pessoa1 = new AlunoInfo("Fabio", "Medicina", "112432432", 25);
    System.out.println(Pessoa1);


    }
}
