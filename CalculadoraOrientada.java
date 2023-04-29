abstract class operações {
    public abstract void soma();
    public abstract void sub();
    public abstract void multi();
    public abstract void div();

}

class somar extends operações {
    private double n1;
    private double n2;

    public somar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double soma() {
        return n1 + n2;
    }
}

class subtrair extends operações {
    private double n1;
    private double n2;

    public double subtrair(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double sub() {
        return n1 - n2;
    }
}

class multiplicar extends operações {
    private double n1;
    private double n2;

    public double multiplicar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double multi() {
        return n1 * n2;
    }
}

class divisão extends operações {
    private double n1;
    private double n2;

    public double divisão(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double div() {
        return n1 / n2;
    }
}

public class Calculadora {
    public static void main(String[] args) {

somar mais = new somar(5, 5);
subtrair menos = new subtrair(10, 8);
multiplicar vezes = new multiplicar(7, 8);
divisão dividir = new divisão(50, 10);

System.out.println("Soma = " mais.somar(););
System.out.println("Subtração = " menos.sub(););
System.out.println("Multiplicação = " vezes.multi(););
System.out.println("Divisão = " dividir.div(););


    }
}
