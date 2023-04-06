import java.util.Scanner;

public class retangulo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o valor da altura do retangulo: ");
        double altura = sc.nextDouble();
    
        System.out.println("Digite o valor da largura do retangulo: ");
        double largura = sc.nextDouble();

        retangulo easy = new retangulo(largura,altura);
    
        System.out.println("Valor do Perimetro: ");
        easy.exibirperimetro1(largura, altura);
    
        System.out.println();
    
        System.out.println("Valor da Área: ");
        easy.exibirarea1(largura, altura);
    }
    
    }
