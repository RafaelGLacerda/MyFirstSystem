public class retangulo {
    
    private static double largura;
    private static double altura;

public retangulo(double largura, double altura){
    this.largura = largura;
    this.altura = altura;
}
public void exibirperimetro1(double largura, double altura){
    System.out.println(largura+altura+largura+altura);
}
public void exibirarea1(double largura, double altura){
    System.out.println(largura*altura);
}
}
