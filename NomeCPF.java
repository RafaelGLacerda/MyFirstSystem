import javax.swing.JOptionPane;

public class DigiteSeuNome {
    public static void main(String[] args){

    String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome aqui ");
    String cpf = (String) JOptionPane.showInputDialog(null, "Digite seu CPF aqui ");

    String mensagem = "Bem-vindo " + nome;
    JOptionPane.showMessageDialog(null, mensagem, nome, JOptionPane.INFORMATION_MESSAGE);

    String numero = "Seu CPF é: " + cpf;
    JOptionPane.showMessageDialog(null, numero, numero, JOptionPane.INFORMATION_MESSAGE);

        
    }
}
