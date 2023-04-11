import java.util.Scanner;

public class array{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o tamanho do array: ");
    int tamanho = sc.nextInt();

    double[] num = new double[tamanho];

    for(int i = 0; i < tamanho; i++){
        System.out.print("Digite o " + (i + 1) + ":");
        num[i] = sc.nextDouble();
    }

    double soma = 0;

    for(double numeros : num){
        soma += numeros;
    }
     System.out.println();
     System.out.print("A soma dos numeros do Array é: " + soma);
