import java.util.Arrays;
import java.util.Scanner;

public class Arrayson7 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho do array: ");
    int tamanho = sc.nextInt();

    int[] arrayson = new int[tamanho];

    for(int i = 0; i < arrayson.length; i++){
        System.out.print("Digite o " + (i + 1) + ": ");
        arrayson[i] = sc.nextInt();
    }

    Arrays.sort(arrayson);

    System.out.println("Ordem crescente: ");
    for(int i = 0; i < arrayson.length; i++){
        System.out.print(arrayson[i] + " ");
    }


    }
}
