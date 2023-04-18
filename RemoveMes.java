import java.util.LinkedList;
import java.util.Queue;

public class xinzhao{
    public static void main(String[] args){

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Janeiro");
        nomes.add("fevereiro");
        nomes.add("março");
        nomes.add("abril");
        nomes.add("maio");
        nomes.add("junho");
        nomes.add("julho");
        nomes.add("agosto");
        nomes.add("setembro");
        nomes.add("outubro");
        nomes.add("novembro");
        nomes.add("dezembro");

        while (!nomes.isEmpty()){

            System.out.println(nomes);
            String elementoRemovido = nomes.remove();
            System.out.println();
            System.out.println(elementoRemovido);
            }
            System.out.println(nomes);

}
}
