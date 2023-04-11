import javax.swing.JOptionPane;

public class cadastroAPP {
    public static void main(String[] args){
    
    String entrada = JOptionPane.showInputDialog("Digite seu nome:", "Digite aqui");

    System.out.println("Nome digitado: " + entrada);
    
    String mensagem = "Nome Digitado: " + entrada;
    JOptionPane.showMessageDialog(null, mensagem);


    }
}
