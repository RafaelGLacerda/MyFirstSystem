mport java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exceções {
    public static void main(String[] args){
        
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao fechar o arquivo.");
            }
        }
        
// Neste exemplo, estamos lendo o conteúdo de um arquivo chamado "arquivo.txt". 
// Estamos usando um bloco try para ler o conteúdo do arquivo e capturar exceções se ocorrerem. 
// Se ocorrer uma exceção de IO (entrada/saída), estamos imprimindo uma mensagem de erro. No bloco finally, 
// estamos fechando o arquivo para garantir que os recursos sejam liberados, independentemente de ocorrer uma exceção ou não.
// É importante fechar o arquivo para garantir que os recursos sejam liberados, 
// pois a falta de fechamento de um arquivo pode causar vazamentos de recursos e falhas de desempenho em programas maiores.


    }
}
