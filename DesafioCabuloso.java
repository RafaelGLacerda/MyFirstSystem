import java.util.Scanner;

public class xadras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabuleiro = new int[8][8];

        System.out.println("Digite o tabuleiro: 8x8: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite as posições iniciais: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = x - 1; i >= 0; i--) {
            if (tabuleiro[i][y] == 2) {
                count++;
                break; 
            } else 
            if (tabuleiro[i][y] == 1) {
                break; 
            }
        }
        for (int i = x + 1; i < 8; i++) { 
            if (tabuleiro[i][y] == 2) {
                count++;
                break;
            } else 
            if (tabuleiro[i][y] == 1) {
                break;
            }
        }
        for (int j = y - 1; j >= 0; j--) { 
            if (tabuleiro[x][j] == 2) {
                count++;
                break;
            } else 
            if (tabuleiro[x][j] == 1) {
                break;
            }
        }
        for (int j = y + 1; j < 8; j++) { 
            if (tabuleiro[x][j] == 2) {
                count++;
                break;
            } else 
            if (tabuleiro[x][j] == 1) {
                break;
            }
        }

        System.out.println("resultado: " + count);
    }
}
