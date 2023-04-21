public class ArrayMinMaxSimples {
    public static void main(String[] args) {
        int[] array = {3, 5, 20, 250, 33};
        int max = array[0]; // assume o primeiro valor como máximo inicial
        int min = array[0]; // assume o primeiro valor como mínimo inicial

        // Encontra o valor máximo e mínimo
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
    }
}
