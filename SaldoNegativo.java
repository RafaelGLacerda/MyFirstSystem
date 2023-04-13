public class contaNegativa {
    public static void main(String[] args){

    String[] titular = {"joão", "maria", "jhonson", "ruan"};
    double[] saldo = {200 , -400.00 , -30.08 , -15.55};

    for(int i = 0; i < titular.length; i++){
        if(saldo[i] <= -1){ // com esse metodo, apenas pessoas com saldos negativos vão aparecer, por esse motivo, joão não aparece.
        System.out.println("Titulares: " + titular[i] + ", Saldo: R$ " + saldo[i]);
        System.out.println();
    }

   }
        
 }

}
