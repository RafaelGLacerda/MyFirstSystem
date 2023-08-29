import java.util.Scanner;

public class CombinedNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Converter de decimal para hexadecimal");
            System.out.println("2. Converter de decimal para octadecimal");
            System.out.println("3. Converter de hexadecimal para decimal");
            System.out.println("4. Converter de octadecimal para decimal");
            System.out.println("5. Converter de decimal para binário");
            System.out.println("6. Converter de binário para decimal");
            System.out.println("7. Realizar soma em binário");
            System.out.println("8. Realizar subtração em binário");
            System.out.println("9. Realizar multiplicação em binário");
            System.out.println("10. Realizar divisão em binário");
            System.out.println("11. Sair");
            System.out.print("Opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 11) {
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
                case 5:
                    System.out.print("Digite um número decimal: ");
                    int decimalNumberBin = scanner.nextInt();
                    scanner.nextLine();
                    String binaryResult = decimalToBinary(decimalNumberBin);
                    System.out.println("Em Binário = " + binaryResult);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Digite um número binário: ");
                    String binaryNumber = scanner.nextLine();
                    int decimalResultBin = binaryToDecimal(binaryNumber);
                    System.out.println("Em Decimal = " + decimalResultBin);
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Digite o primeiro número binário: ");
                    String binaryNumber1 = scanner.nextLine();
                    System.out.print("Digite o segundo número binário: ");
                    String binaryNumber2 = scanner.nextLine();
                    String sumResult = binaryAddition(binaryNumber1, binaryNumber2);
                    System.out.println("Resultado da Soma = " + sumResult);
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Digite o primeiro número binário: ");
                    String binaryNumberMinuend = scanner.nextLine();
                    System.out.print("Digite o segundo número binário: ");
                    String binaryNumberSubtrahend = scanner.nextLine();
                    String subResult = binarySubtraction(binaryNumberMinuend, binaryNumberSubtrahend);
                    System.out.println("Resultado da Subtração = " + subResult);
                    System.out.println();
                    break;
                case 9:
                    System.out.print("Digite o primeiro número binário: ");
                    String binaryNumberMult1 = scanner.nextLine();
                    System.out.print("Digite o segundo número binário: ");
                    String binaryNumberMult2 = scanner.nextLine();
                    String multResult = binaryMultiplication(binaryNumberMult1, binaryNumberMult2);
                    System.out.println("Resultado da Multiplicação = " + multResult);
                    System.out.println();
                    break;
                case 10:
                    System.out.print("Digite o numerador binário: ");
                    String binaryNumerator = scanner.nextLine();
                    System.out.print("Digite o denominador binário: ");
                    String binaryDenominator = scanner.nextLine();
                    String[] divResult = binaryDivision(binaryNumerator, binaryDenominator);
                    System.out.println("Resultado da Divisão = Quociente: " + divResult[0] + ", Resto: " + divResult[1]);
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

    public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public static String binaryAddition(String binaryNumber1, String binaryNumber2) {
        int decimalSum = binaryToDecimal(binaryNumber1) + binaryToDecimal(binaryNumber2);
        return decimalToBinary(decimalSum);
    }

    public static String binarySubtraction(String binaryMinuend, String binarySubtrahend) {
        int decimalDifference = binaryToDecimal(binaryMinuend) - binaryToDecimal(binarySubtrahend);
        return decimalToBinary(decimalDifference);
    }

    public static String binaryMultiplication(String binaryNumber1, String binaryNumber2) {
        int decimalProduct = binaryToDecimal(binaryNumber1) * binaryToDecimal(binaryNumber2);
        return decimalToBinary(decimalProduct);
    }

    public static String[] binaryDivision(String binaryNumerator, String binaryDenominator) {
        int decimalQuotient = binaryToDecimal(binaryNumerator) / binaryToDecimal(binaryDenominator);
        int decimalRemainder = binaryToDecimal(binaryNumerator) % binaryToDecimal(binaryDenominator);
        return new String[]{decimalToBinary(decimalQuotient), decimalToBinary(decimalRemainder)};
    }
}
