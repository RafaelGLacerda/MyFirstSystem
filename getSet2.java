package projetosbasicos;

public class getset2 {
	
private String nomeTime;

public void setTime(String meuTime) {
	 nomeTime = meuTime;
}

public String getTime() {
	return nomeTime;
}
public void mostrarTime() {
	
	System.out.print("SEU TIME DO CORACAO,  " +getTime());
}


}
