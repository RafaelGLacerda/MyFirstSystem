import java.util.Scanner;

public class MatrizMaiorNumero {
    public static void main(String[] args){

    int[][] Jhonsons = new int[3][3];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    // sim, no max coloca o MIN, no min coloca o MAX.

    Scanner sc = new Scanner(System.in);

System.out.println("Declare numeros para uma matriz de 3x3: ");
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        Jhonsons[i][j] = sc.nextInt();
    }
}
for(int i = 0; i < Jhonsons.length; i++){
    for(int j = 0; j < Jhonsons.length; j++){
        if(Jhonsons[i][j] > max){
            max = Jhonsons[i][j];
        }
        if(Jhonsons[i][j] < min){
            min = Jhonsons[i][j];
        }
    }
}

System.out.println();
System.out.println("Maior numero = " + max);
System.out.println("Menor numero = " + min);



    }
}
