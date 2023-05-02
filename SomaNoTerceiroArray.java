public class Arrayson5 {
    public static void main(String[] args){

int[] numerozinhoo = {3, 5, 43, 654, 76, 43, 1, 2, 6, 0};
int[] numerunn = {3, 4, 6, 8, 32, 232, 532, 643, 100, 3};
int[] soma = new int[10];


for(int i = 0; i < numerozinhoo.length; i++){
    soma[i] = numerozinhoo[i] + numerunn[i];
}
for(int i = 0; i < soma.length; i++){
System.out.print(soma[i] + " ");
}


    }
}
