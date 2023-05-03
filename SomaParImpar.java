public class Arrayson8{
    public static void main(String[] args){

int[] numerunn = {3, 4, 6, 8, 32, 232, 532, 643, 100, 3};
int somapar = 0;
int somaimp = 0;

for(int numero : numerunn){
if(numero % 2 == 0){
somapar +=  numero;
} else 
somaimp += numero;
}

System.out.println("Soma pares = " + somapar);
System.out.println("Soma impares = " + somaimp);



    }
}
