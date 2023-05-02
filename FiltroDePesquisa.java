public class Arrayson6 {
    public static void main(String[] args){

String[] Palavras = {"pessego ", "lapis", "livro", "pessoa", "irmão", "diario", "Passos", "Fazer", "Palavra"};

for(int i = 0; i < Palavras.length; i++){
    char letra = Palavras[i].charAt(0);
    if(letra == 'p' || letra == 'P'){
        System.out.println(Palavras[i]);
    }
}


    }
}
