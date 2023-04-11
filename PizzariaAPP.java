import javax.swing.JOptionPane;

public class cadastroAPP {
    public static void main(String[] args){

    String[] pizzas = {"Pepperoni", "Portuguesa", "Calabresa", "Muzzarela", "Frango Catupiry"};
    
    String entrada = (String) JOptionPane.showInputDialog(null, "Selecione a Pizza de sua escolha", "Sabores de Pizza", JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);

    System.out.println("Pizza Escolhida: " + entrada);
    
    String mensagem = "Pizza Escolhida: " + entrada;
    JOptionPane.showMessageDialog(null, mensagem);


    }
}
