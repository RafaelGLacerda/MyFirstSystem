import javax.swing.JOptionPane;

public class AplicativoSimples {
   
    public static void main(String[]args){

    String[] opções = new String[] {"Anime", "Series", "Filmes", "Sair"};


    int opcaoescolhida = 0;
    
    while (opcaoescolhida != 3){
      opcaoescolhida = JOptionPane.showOptionDialog(
        null,
      "O que você deseja assistir",
       "Netflix", 
       JOptionPane.DEFAULT_OPTION, 
       JOptionPane.QUESTION_MESSAGE, 
       null, 
       opções, 
       0);

       System.out.println("Opção escolhida: " + opcaoescolhida);

    if(opcaoescolhida != 3){
        String mensagem = "Você assistiu " + opções[opcaoescolhida];
        JOptionPane.showMessageDialog(null,  mensagem);
    }
    if(opcaoescolhida != 1){
        String mensagem = "Você assistiu " + opções[opcaoescolhida];
    }
    if(opcaoescolhida != 2){
        String mensagem = "Você assistiu " + opções[opcaoescolhida];
    }
    if(opcaoescolhida != 0){
        String mensagem = "Você Saiu " + opções[opcaoescolhida];
    }


    }
}
}
