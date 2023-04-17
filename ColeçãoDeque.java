import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
    public static void main(String[] args){

Deque<String> deque = new ArrayDeque<>();
deque.addFirst("Rafael");
deque.addLast("Paulo");
deque.addFirst("Marcos");

// First/Last, determinam a ordem dessa lista 'Deque'.

String primeiro = deque.getFirst();
String ultimo = deque.getLast();

System.out.println(primeiro);
System.out.println(ultimo);



    }
}
