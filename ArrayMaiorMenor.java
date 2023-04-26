import java.util.Scanner;

public class arraybasic{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de numeros: ");
    int quantidade = sc.nextInt();

    double[] numeros = new double[quantidade];
 

for(int i = 0; i < quantidade; i++){
    System.out.print("Digite o " + (i + 1) + ": ");
    numeros[i] = sc.nextDouble();
}

double maior = numeros[0];
double menor = numeros[0];

for(int i = 1; i < numeros.length; i++){
    if(numeros[i] > maior){
        maior = numeros[i];
    }
    if(numeros[i] < menor){
        menor = numeros[i];
       
    }
}


System.out.println("menor numero = " + menor);
System.out.println("Maior numero = " + maior);


    }
}
