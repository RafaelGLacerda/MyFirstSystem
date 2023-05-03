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

int SegundoMaior = Integer.MIN_VALUE;
int Maior = Integer.MIN_VALUE;
for(int i = 0; i < tamanho; i++){
if(numeros[i] > Maior){
    SegundoMaior = Maior;
    Maior = numeros[i];
} else
if(numeros[i] > SegundoMaior && numeros[i] != Maior){
    SegundoMaior = numeros[i];
}
}

if(SegundoMaior == Integer.MIN_VALUE){
    System.out.println("Não a segundo maior!");
} else
System.out.println("Segundo Maior = " + SegundoMaior);


 }   
}
