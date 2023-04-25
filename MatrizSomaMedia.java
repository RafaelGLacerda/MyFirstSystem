import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

int[][] matrix = new int[3][3];
int soma = 0;
double media = 0;
Scanner sc = new Scanner(System.in);

System.out.println("Preencha os 9 numeros da matriz com um espaço: Ex(3 5 6): ");
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        matrix[i][j] = sc.nextInt();
        soma += matrix[i][j];
        media = soma / 9;

    }
}
System.out.println();
System.out.println("Soma da Matriz = " + soma);
System.out.println("Media da Matriz = " + media);
}
}
