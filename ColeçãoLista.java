import java.util.ArrayList;
import java.util.List;

public class ArrayList0{
    public static void main(String[] args){

List<String> listaDeTarefas = new ArrayList<>();
listaDeTarefas.add("Fazer compras no mercado");
listaDeTarefas.add("Lavar louça");
listaDeTarefas.add("Estudar programação");
listaDeTarefas.add("ir pra faculdade");
listaDeTarefas.add("etc, etc");

listaDeTarefas.remove(1); // remove um item da lista.

System.out.println(listaDeTarefas.get(0));
System.out.println(listaDeTarefas.get(1));
System.out.println(listaDeTarefas.get(2));
System.out.println(listaDeTarefas.get(3));
System.out.println(listaDeTarefas.get(4));
System.out.println(listaDeTarefas.get(5));




    }
}
