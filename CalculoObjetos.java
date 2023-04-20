class Retangulo {
private double base;
private double altura;

public Retangulo(double base, double altura){
this.base = base;
this.altura = altura;
}

public double getBase(){
return base;
}

public double getAltura(){
return altura;
}

public void setBase(double base){
this.base = base;
}

public void setAltura(double altura){
this.altura = altura;
}
}

class Quadrado extends Retangulo {

public Quadrado(double lado) {
super(lado, lado);
}
}

public class CalculoObjetos {
public static void main(String[] args){

    // "lado" é a mesma coisa da base e altura, porém, com apenas 1 valor igual que vale para os dois.
Quadrado objeto1 = new Quadrado(4.0); 
Retangulo objeto2 = new Retangulo(10, 5);

System.out.println("Área do Quadrado: " + objeto1.getBase() * objeto1.getAltura());
System.out.println("Área do Retângulo: " + objeto2.getBase() * objeto2.getAltura());

}
}
