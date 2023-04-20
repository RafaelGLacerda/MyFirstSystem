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
public String getNome(){
    return nome;
}
public String getCurso(){
    return curso;
}
public String getMatricula(){
    return matricula;
}
public int getIdade(){
    return idade;
}
}
public class Aluno{

    public static void main(String[] args){

    AlunoInfo Pessoa1 = new AlunoInfo("Pedro Miguel Nascimento", "Farmacia", "3213122321", 21);

    System.out.println("-----> Informações do aluno: <-----");
    System.out.println("Nome: " + Pessoa1.getNome());
    System.out.println("idade: " + Pessoa1.getIdade());
    System.out.println("Matricula e curso: " + Pessoa1.getMatricula() +  "  -  " + Pessoa1.getCurso());
    
    }
}
