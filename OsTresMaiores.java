import java.util.Arrays;
import java.util.Scanner;

public class Arraysonn12 {
 public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Digite o tamanho do array: ");
int tamanho = sc.nextInt();

int[] numeros = new int[tamanho];

for(int i = 0; i < numeros.length; i++){
    System.out.print("Digite o " + (i + 1) + ": ");
    numeros[i] = sc.nextInt();
}

Arrays.sort(numeros);
int Maior = numeros[numeros.length -1];
int segundoMaior = numeros[numeros.length -2];
int terceiroMaior = numeros[numeros.length -3];


System.out.println("Maior numero = " + Maior);
System.out.println("Segundo maior numero = " + segundoMaior);
System.out.println("Terceiro maior numero = " + terceiroMaior);

 }
}
