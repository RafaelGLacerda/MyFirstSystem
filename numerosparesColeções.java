import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class numerospares {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(12);
        numbers.add(15);
        numbers.add(20);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
