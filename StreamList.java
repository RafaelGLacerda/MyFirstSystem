import java.util.Arrays;
import java.util.List;

public class StreamList{
    public static void main(String[] args){


List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

long contagem = numeros.stream()
                      .filter(n -> n % 2 == 0)
                      .count();

System.out.println("Há " + contagem + " números pares.");

    }
}
