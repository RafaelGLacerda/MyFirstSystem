    public class Arraysonn10 {
        public static void main(String[] args){

    int[] low = {3, 3, 3, 3, 3};
    int primeiro = low[0];
    boolean iguais = true;

    for(int i = 1; i < low.length; i++){
    if(low[i] != primeiro){
    iguais = true;
    break;
    }
    }

    if(iguais){
        System.out.println("Elementos iguais!");
    } else
      System.out.println("Não iguais!");


        }
    }
