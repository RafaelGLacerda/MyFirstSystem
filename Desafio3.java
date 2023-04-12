public class Ampulheta {
    public static void main(String[] args) {
        int[][] matriz = {{1, 1, 1, 0, 0, 0},
                          {0, 1, 0, 0, 0, 0},
                          {1, 1, 1, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0}};

        int tamanhoMaximo = 0; // Tamanho da maior ampulheta
        int linhaInicialMaxima = 0; // Linha inicial da maior ampulheta
        int colunaInicialMaxima = 0; // Coluna inicial da maior ampulheta

        // Percorre todas as possíveis ampulhetas da matriz
        for (int linhaInicial = 0; linhaInicial <= matriz.length - 3; linhaInicial++) {
            for (int colunaInicial = 0; colunaInicial <= matriz[0].length - 3; colunaInicial++) {
                // Verifica se é uma ampulheta válida
                if (ehAmpulheta(matriz, linhaInicial, colunaInicial)) {
                    // Calcula o tamanho da ampulheta
                    int tamanho = tamanhoAmpulheta(matriz, linhaInicial, colunaInicial);

                    // Verifica se é a maior ampulheta encontrada até agora
                    if (tamanho > tamanhoMaximo) {
                        tamanhoMaximo = tamanho;
                        linhaInicialMaxima = linhaInicial;
                        colunaInicialMaxima = colunaInicial;
                    }
                }
            }
        }

        // Imprime a maior ampulheta encontrada
        System.out.println("Maior ampulheta encontrada:");
        for (int i = linhaInicialMaxima; i <= linhaInicialMaxima + 2; i++) {
            for (int j = colunaInicialMaxima; j <= colunaInicialMaxima + 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica se é uma ampulheta válida
    public static boolean ehAmpulheta(int[][] matriz, int linhaInicial, int colunaInicial) {
        // Verifica se a posição central é 1
        if (matriz[linhaInicial + 1][colunaInicial + 1] != 1) {
            return false;
        }

        // Verifica se as outras posições formam uma ampulheta
        return matriz[linhaInicial][colunaInicial] == 1 &&
               matriz[linhaInicial][colunaInicial + 1] == 1 &&
               matriz[linhaInicial][colunaInicial + 2] == 1 &&
               matriz[linhaInicial + 1][colunaInicial] == 0 &&
               matriz[linhaInicial + 1][colunaInicial + 2] == 0 &&
               matriz[linhaInicial + 2][colunaInicial] == 1 &&
               matriz[linhaInicial + 2][colunaInicial + 1] == 1 &&
               matriz[linhaInicial + 2][colunaInicial + 2] == 1;
    }

    //
