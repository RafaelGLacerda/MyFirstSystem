import java.util.Scanner;

public class MatrizInsana {
    public static void main(String[] args) {

        int[][] primeira = new int[2][2];
        int[][] segunda = new int[2][2];
        int[][] soma = new int[2][2];

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite a primeira matriz 2x2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                primeira[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Digite a segunda matriz 2x2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                segunda[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = primeira[i][j] + segunda[i][j];
            }
        }

        System.out.println("Matriz resultante da soma: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
