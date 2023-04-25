import java.util.Scanner;

public class MatrizDupla{
    public static void main(String[] args){

        int[][] primeira = new int[2][2];
        int[][] segunda = new int[2][2];

        Scanner sc = new Scanner(System.in);
        double media = 0;
        int soma = 0;

        System.out.println("Digite a primeira matriz 2x2: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                primeira[i][j] = sc.nextInt();
                soma += primeira[i][j];
            }
        }
        System.out.println();
        System.out.println("Digite a segunda matriz 2x2: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                segunda[i][j] = sc.nextInt();
                soma += segunda[i][j];
            }
        }
        
        media = soma / 8;
        System.out.println();
        System.out.println("Soma das duas Matrizes = " + soma);
        System.out.println("Media das duas Matrizes = " + media);

    }
}
