import javax.swing.JOptionPane;

public class InserirNome {
    public static void main(String[] args){


String entrada = JOptionPane.showInputDialog(null, "Digite Seu nome:");

String mensagem = "Bem-vindo: " + entrada;
JOptionPane.showMessageDialog(null, mensagem, entrada, JOptionPane.INFORMATION_MESSAGE);

    }
}
