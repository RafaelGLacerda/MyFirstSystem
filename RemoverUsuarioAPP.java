import javax.swing.JOptionPane;

public class RemoverUsuarioAPP{

public static void main(String[] args){

int entrada = JOptionPane.showConfirmDialog(null, "Deseja REMOVER esse usuario?", "Atenção", JOptionPane.YES_NO_OPTION);
if (entrada == JOptionPane.YES_OPTION){
    JOptionPane.showMessageDialog(null, "Usuario Removido com sucesso!");
} else 
    if(entrada == JOptionPane.NO_OPTION){
        JOptionPane.showMessageDialog(null, "Usuario NÃO REMOVIDO!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

System.out.println("Fim do programa");

}

}
