import java.util.Scanner;

public class CarroFuncional {
    public static void main(String[] args){
    
            Scanner scanner = new Scanner(System.in);
            int velocidade = 0;
            int opcao;
        
            do {
              System.out.println("Velocidade atual: " + velocidade + " km/h");
              System.out.println("Digite 1 para frear ou 2 para acelerar:");
              opcao = scanner.nextInt();
        
              switch (opcao) {
                case 1:
                  if (velocidade >= 20) {
                    velocidade -= 20;
                  } else {
                    System.out.println("O carro já está parado!");
                  }
                  break;
        
                case 2:
                  if (velocidade < 320) {
                    velocidade += 20;
                  } else {
                    System.out.println("Velocidade máxima atingida!");
                  }
                  break;
        
                default:
                  System.out.println("Opção inválida!");
                  break;
              }
            } while (opcao == 1 || opcao == 2);
        
            System.out.println("Fim da simulação!");
          }
        }
