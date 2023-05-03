import java.util.Arrays;

public class Arraysonn11 {
    public static void main(String[] args){

int[] numerunn = {3, 4, 6, 8, 32, 232, 532, 643, 100, 3, 5, 654, 43243, 321, 3232, 5443, 9875};

Arrays.sort(numerunn);
int Maior = numerunn[numerunn.length -1];
int segundoMaior = numerunn[numerunn.length -2];
int terceiroMaior = numerunn[numerunn.length -3];

System.out.println("Maior numero = " + Maior);
System.out.println("Segundo maior numero = " + segundoMaior);
System.out.println("Terceiro maior numero = " + terceiroMaior);





    }
}
