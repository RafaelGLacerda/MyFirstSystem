import java.util.ArrayList;
import java.util.List;

public class numbers {
    public static void main(String[] args){


  List<Integer> numeros = new ArrayList<>();
  numeros.add(10);
  numeros.add(4);
  numeros.add(12);
  numeros.add(8);
  numeros.add(29);

// soma
int soma = 0;
for(int somar : numeros){
    soma += somar;
}
// media
double media = (double) soma / numeros.size();


// Disvio-Padrão
double somaQuadradosDiferencas = 0;
for(int numero : numeros){
    somaQuadradosDiferencas += Math.pow(numero - media, 2);
}
double variancia = somaQuadradosDiferencas / numeros.size();

double desvio = Math.sqrt(variancia);


System.out.println("soma dos numeros: " + soma);
System.out.println("media dos numeros: " +media);
System.out.println("desvio-padrão dos numeros: " +desvio);

    }
    
}
