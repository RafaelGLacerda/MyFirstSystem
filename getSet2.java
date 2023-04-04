package projetosbasicos;

public class getset2 {
	
private String nomeTime;
private String nomeSelecao;

public void setTime(String meuTime) {
	 nomeTime = meuTime;
}

public String getTime() {
	return nomeTime;
}
public void mostrarTime() {
	
	System.out.print("SEU TIME DO CORACAO,  " +getTime());
}



public void SetSelecao(String minhaSelecao) {
	nomeSelecao = minhaSelecao;
}
public String getSelecao() {
	return nomeSelecao;
}
public void mostrarSelecao() {
	System.out.print("Voce torce para a selecao,  " +getSelecao());
}

}
