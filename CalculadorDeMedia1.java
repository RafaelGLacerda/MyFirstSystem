import java.util.Scanner;

public class aluno2 {
    public static void main(String[] args){

    aluno1 easy = new aluno1();

    easy.nome();
    easy.matricula();

    int tamanho;
    int soma = 0;
    double media;

     Scanner sc = new Scanner(System.in);
  
    System.out.print("Digite a quantidade de notas diferentes: ");
    tamanho = sc.nextInt();
        
    double[] nota = new double[tamanho];
        
    for(int i = 0; i < tamanho; i++){
    System.out.println("Digite o " + (i + 1) + ":");
    nota[i] = sc.nextDouble();
    soma += nota[i];
    media = soma / (i + 1.0);
  }

  media = soma / (double) tamanho;
  System.out.println();
  System.out.println("A media é: " + media);
}
}
