import java.util.function.IntFunction;
import java.util.function.Predicate;

public class ExpressõesLambdas {
    public static void main(String[] args){


IntFunction<Integer> dobro = x -> x * 10;

int resultado1 = dobro.apply(50); 

System.out.println(resultado1);

Predicate<Integer> Par = x -> x % 2 == 0;

boolean ParResultado = Par.test(resultado1); // par 
boolean ImparResultado = !Par.test(resultado1); // impar

// esse programa pega o valor do primeiro resultado dobrado e verifica se é par ou impar.

System.out.println(ParResultado);
System.out.println(ImparResultado);



    }
}
