import javax.swing.JOptionPane;

public class CombinedNumberConverter2 {
    public static void main(String[] args) {
        while (true) {
            String[] options = {"Converter", "Operações", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Conversor de Números", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                break;
            }

            switch (choice) {
                case 0:
                    convertOptions();
                    break;
                case 1:
                    operationOptions();
                    break;
            }
        }
    }

    public static void convertOptions() {
        String[] convertOptions = {"Decimal para Hexadecimal", "Decimal para Octadecimal", "Hexadecimal para Decimal", "Octadecimal para Decimal", "Decimal para Binário", "Binário para Decimal"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção de conversão:", "Conversão de Números", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, convertOptions, convertOptions[0]);

        switch (choice) {
            case 0:
                int decimalNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número decimal:"));
                String hexResult = decimalToHexadecimal(decimalNumber);
                JOptionPane.showMessageDialog(null, "Em Hexadecimal = " + hexResult);
                break;
            case 1:
                int decimalNumberOct = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número decimal:"));
                String octResult = decimalToOctal(decimalNumberOct);
                JOptionPane.showMessageDialog(null, "Em Octadecimal = " + octResult);
                break;
            case 2:
                String hexNumber = JOptionPane.showInputDialog(null, "Digite um número hexadecimal:");
                int decimalResult = hexadecimalToDecimal(hexNumber);
                JOptionPane.showMessageDialog(null, "Em Decimal = " + decimalResult);
                break;
            case 3:
                String octNumber = JOptionPane.showInputDialog(null, "Digite um número octadecimal:");
                int decimalResultOct = octalToDecimal(octNumber);
                JOptionPane.showMessageDialog(null, "Em Decimal = " + decimalResultOct);
                break;
            case 4:
                int decimalNumberBin = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número decimal:"));
                String binaryResult = decimalToBinary(decimalNumberBin);
                JOptionPane.showMessageDialog(null, "Em Binário = " + binaryResult);
                break;
            case 5:
                String binaryNumber = JOptionPane.showInputDialog(null, "Digite um número binário:");
                int decimalResultBin = binaryToDecimal(binaryNumber);
                JOptionPane.showMessageDialog(null, "Em Decimal = " + decimalResultBin);
                break;
        }
    }

    public static void operationOptions() {
        String[] operationOptions = {"Soma em Binário", "Subtração em Binário", "Multiplicação em Binário", "Divisão em Binário"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Operações com Números Binários", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, operationOptions, operationOptions[0]);

        switch (choice) {
            case 0:
                String binaryNumber1 = JOptionPane.showInputDialog(null, "Digite o primeiro número binário:");
                String binaryNumber2 = JOptionPane.showInputDialog(null, "Digite o segundo número binário:");
                String sumResult = binaryAddition(binaryNumber1, binaryNumber2);
                JOptionPane.showMessageDialog(null, "Resultado da Soma = " + sumResult);
                break;
            case 1:
                String binaryNumberMinuend = JOptionPane.showInputDialog(null, "Digite o primeiro número binário:");
                String binaryNumberSubtrahend = JOptionPane.showInputDialog(null, "Digite o segundo número binário:");
                String subResult = binarySubtraction(binaryNumberMinuend, binaryNumberSubtrahend);
                JOptionPane.showMessageDialog(null, "Resultado da Subtração = " + subResult);
                break;
            case 2:
                String binaryNumberMult1 = JOptionPane.showInputDialog(null, "Digite o primeiro número binário:");
                String binaryNumberMult2 = JOptionPane.showInputDialog(null, "Digite o segundo número binário:");
                String multResult = binaryMultiplication(binaryNumberMult1, binaryNumberMult2);
                JOptionPane.showMessageDialog(null, "Resultado da Multiplicação = " + multResult);
                break;
            case 3:
                String binaryNumerator = JOptionPane.showInputDialog(null, "Digite o numerador binário:");
                String binaryDenominator = JOptionPane.showInputDialog(null, "Digite o denominador binário:");
                String[] divResult = binaryDivision(binaryNumerator, binaryDenominator);
                JOptionPane.showMessageDialog(null, "Resultado da Divisão = Quociente: " + divResult[0] + ", Resto: " + divResult[1]);
                break;
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
