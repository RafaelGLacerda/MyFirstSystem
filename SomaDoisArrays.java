public class Arrayson4 {
    public static void main(String[] args){

int[] numerozinhoo = {3, 5, 43, 654, 76, 43, 1, 2, 6, 0};
int[] numerunn = {3, 4, 6, 8, 32, 232, 532, 643, 100, 3};

int somar = 0;
for(int numero : numerozinhoo){
somar += numero;
}
int somar2 = 0;
for(int numero : numerunn){
somar2 += numero;
}

double resultado = somar + somar2;

System.out.println(resultado);





    }
}
