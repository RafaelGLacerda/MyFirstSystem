import java.util.LinkedList;
import java.util.Queue;

public class Queue1{
    public static void main(String[] args){

Queue<String> fila = new LinkedList<>();

fila.add("Rafael");
fila.add("Fernando");
fila.add("Marcelo");
fila.add("Jhonsons");
fila.add("Gangplank");

while (!fila.isEmpty()){

System.out.println(fila);
String elementoRemovido = fila.remove();
System.out.println();
System.out.println(elementoRemovido);
}
System.out.println(fila);


    }
}
