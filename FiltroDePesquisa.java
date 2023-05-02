public class FiltroArray {
    public static void main(String[] args){


String[] Palavras = {"bateria", "borracha", "função", "breve", "porta", "pessoa", "Bruno", "fraco", "Pedro", "Paulo", "frio", "promoção"};


System.out.println("-----> Palavras começando com 'P': <-----");
for(int i = 0; i < Palavras.length; i++){
    char letra = Palavras[i].charAt(0);
    if(letra == 'p' || letra == 'P'){
        System.out.println(Palavras[i]);
    }
}
System.out.println();
System.out.println("-----> Palavras começando com 'F': <-----");
for(int i = 0; i < Palavras.length; i++){
    char letra = Palavras[i].charAt(0);
    if(letra == 'f' || letra == 'F'){
        System.out.println(Palavras[i]);
    }
}
System.out.println();
System.out.println("-----> Palavras começando com 'B': <-----");
for(int i = 0; i < Palavras.length; i++){
    char letra = Palavras[i].charAt(0);
    if(letra == 'b' || letra == 'B'){
        System.out.println(Palavras[i]);
    }
}


    }
}
