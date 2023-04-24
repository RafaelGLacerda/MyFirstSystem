abstract class Formas{
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}
class Retangulo extends Formas{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return base + altura + base + altura;
    }
    
}
class circulo extends Formas{
    private double raio;
    public  circulo(double raio){
        this.raio = raio;
    }
public double calcularArea(){
    return Math.PI * raio * raio;
}
public double calcularPerimetro(){
    return 2 * Math.PI * raio;
}
}
class Triangulo extends Formas{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
    this.base = base;
    this.altura = altura;
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
}
public double calcularArea(){
    return (base * altura) / 2;

}
public double calcularPerimetro(){
    return lado1 + lado2 + lado3;
}  
}
public class FormasGeometricas{
    public static void main(String[] args){

Retangulo r1 = new Retangulo(2, 4);
circulo c1 = new circulo(10);
Triangulo t1 = new Triangulo(5, 3, 5, 7, 9);


System.out.println("Area do retangulo: " + r1.calcularArea());
System.out.println("Perimetro do retangulo: " + r1.calcularPerimetro());

System.out.println();

System.out.println("Area do retangulo: " + c1.calcularArea());
System.out.println("Perimetro do retangulo: " + c1.calcularPerimetro());

System.out.println();

System.out.println("Area do retangulo: " + t1.calcularArea());
System.out.println("Perimetro do retangulo: " + t1.calcularPerimetro());

    }
}
