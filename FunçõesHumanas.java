class Humane {
    private String nome;
    public Humane(String nome){
        this.nome = nome;
    }

public void Falar(){
 System.out.println(nome + " está falando!");
}
public void Comer(){
    System.out.println(nome + " está comendo!");
}
public void Beber(){
    System.out.println(nome + " está bebendo!");
}
public void Dirigir(){
    System.out.println(nome + " está dirigindo!");
}
public void Dormir(){
    System.out.println(nome + " está dormindo!");
}
}
class pessoa1 extends Humane{
    public pessoa1(){
        super("João");
    }
}
class pessoa2 extends Humane{
    public pessoa2(){
        super("Maria");
    }
}
class pessoa3 extends Humane{
    public pessoa3(){
       super("Pedro");
    }
}
public class FunçõesHumanas{
 public static void main(String[] args){

pessoa1 p1 = new pessoa1();
pessoa2 p2 = new pessoa2();
pessoa3 p3 = new pessoa3();

p1.Falar();
p1.Comer();
p1.Dirigir();
p1.Beber();
p1.Dormir();

System.out.println();
p2.Falar();
p2.Comer();
p2.Dirigir();
p2.Beber();
p2.Dormir();

System.out.println();
p3.Falar();
p3.Comer();
p3.Dirigir();
p3.Beber();
p3.Dormir();


 }
}
