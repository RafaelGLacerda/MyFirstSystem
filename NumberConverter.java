import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Converter de decimal para hexadecimal");
            System.out.println("2. Converter de decimal para octadecimal");
            System.out.println("3. Converter de hexadecimal para decimal");
            System.out.println("4. Converter de octadecimal para decimal");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 5) {
                System.out.println("Encerrando o programa.");
                break;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Digite um número decimal: ");
                    int decimalNumber = scanner.nextInt();
                    scanner.nextLine();  
                    String hexResult = decimalToHexadecimal(decimalNumber);
                    System.out.println("Em Hexadecimal = " + hexResult);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Digite um número decimal: ");
                    int decimalNumberOct = scanner.nextInt();
                    scanner.nextLine();  
                    String octResult = decimalToOctal(decimalNumberOct);
                    System.out.println("Em Octadecimal = " + octResult);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Digite um número hexadecimal: ");
                    String hexNumber = scanner.nextLine();
                    int decimalResult = hexadecimalToDecimal(hexNumber);
                    System.out.println("Em Decimal = " + decimalResult);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Digite um número octadecimal: ");
                    String octNumber = scanner.nextLine();
                    int decimalResultOct = octalToDecimal(octNumber);
                    System.out.println("Em Decimal = " + decimalResultOct);
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    System.out.println();
            }
        }
    }
    
    public static String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }
    
    public static String decimalToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
    
    public static int hexadecimalToDecimal(String hexNumber) {
        return Integer.parseInt(hexNumber, 16);
    }
    
    public static int octalToDecimal(String octNumber) {
        return Integer.parseInt(octNumber, 8);
    }
}
