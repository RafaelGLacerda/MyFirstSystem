import java.util.HashMap;
import java.util.Map;

public class ArrayMap {
    public static void main(String[] args){

Map<String, Double> notaDosAlunos = new HashMap<>();
notaDosAlunos.put("Alice", 8.5);
notaDosAlunos.put("Bob", 5.6);
notaDosAlunos.put("Fernando", 7.5);
notaDosAlunos.put("Albert", 6.4);
notaDosAlunos.put("Fabrizzio", 9.2);

System.out.println(notaDosAlunos.get("Alice"));
System.out.println(notaDosAlunos.get("Bob"));
System.out.println(notaDosAlunos.get("Fernando"));
System.out.println(notaDosAlunos.get("Albert"));
System.out.println(notaDosAlunos.get("Fabrizzio"));

    }
}
