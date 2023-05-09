 class Atv {
 String matricula;
 String nome;
 double n1;
 double n2;
 double nt;
 String finals;
 
 public Atv (
    String matricula, String nome, double n1, double n2, double nt,  String finals

 ){
  this.matricula = matricula;
  this.nome = nome;
  this.n1 = n1;
  this.n2 = n2;
  this.nt = nt;
  this.finals = finals;
 }
public String getNome(){
    return nome;
}
public String geMatricula(){
    return matricula;
}
public double getMedia(){
    return ((n1*2.5) + (n2*2.5) + (nt*2)) / 7;
}
public String getFinal(){
    if(((n1*2.5) + (n2*2.5) + (nt*2)) / 7 >= 5){
        finals = "Aprovado";    
    }
    return finals;
}
}
public class Ku{
    public static void main(String[] args){

    
Atv a1 = new Atv("32132132131", "Antony", 3, 3, 3, "apto para prova final");

System.out.println("Matricula: " + a1.geMatricula() + ", Nome: " + a1.getNome() + ", Media: " + a1.getMedia() + ", Situação: " + a1.getFinal());



    }
}
