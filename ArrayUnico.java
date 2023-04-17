import java.util.HashSet;
import java.util.Set;

public class ArrayList1 {
    public static void main(String[] args){

Set<String> usuariosUnicos = new HashSet<>();
usuariosUnicos.add("Alice");
usuariosUnicos.add("bob");
usuariosUnicos.add("Alice");
usuariosUnicos.add("bob");
usuariosUnicos.add("Charlie");
usuariosUnicos.add("Juan");
usuariosUnicos.add("bob");
usuariosUnicos.add("Charlie");

// nesse programa, mesmo se eu repetir o nome, não será imprimido mais de uma vez.

for(String usuario : usuariosUnicos ){
    System.out.println(usuario);
}


    }
}
