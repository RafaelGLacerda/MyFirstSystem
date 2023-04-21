import java.util.ArrayList;
import java.util.List;

public class ArrayListCalculo {
    public static void main(String[] args){

List<Integer> jojo = new ArrayList<>();

jojo.add(100);
jojo.add(30);
jojo.add(45);
jojo.add(12);
jojo.add(5);


int soma = 0;
for(int somar : jojo){
    soma += somar;
}
int sub = 0;
for(int subtrair : jojo){
    sub -= subtrair;
}
int media = 0;
for(int Amedia : jojo){
    media = soma / Amedia;
}
System.out.println("Soma do array = " + soma);
System.out.println("Subtração do array = " + sub);
System.out.println("Media do array = " + media);
    }
}
