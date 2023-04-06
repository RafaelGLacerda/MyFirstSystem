import java.util.Scanner;

public class circulo{

private static double raio;


public circulo(double circulo1){
this.raio = circulo1;
}

public void exibirperimetro(double circulo1){
    System.out.println(circulo1 = 2*Math.PI*raio);
}
public void exibirarea(double circulo1){
    System.out.println(circulo1 = Math.PI*Math.pow(raio, 2));
}
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Valor do raio: ");
raio = sc.nextDouble();

circulo easy = new circulo(raio);

System.out.println("O valor do perimetro é: ");
easy.exibirperimetro(raio);

System.out.println();

System.out.println("O valor da área é: ");
easy.exibirarea(raio);
}

}
