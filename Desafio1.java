import java.util.*;

class array {
    public static int[] twoSum(int[] nums, int target) {
    	
    	// "MAP" objeto que mapeia valores para chaves (numeros)
    	// "TwoSum" retorno duas variaveis (num, target)
    	
        Map<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[] {numIndices.get(complement), i};
            }
            numIndices.put(nums[i], i);
        }
        return null;  // Caso não encontre uma solução
    }

    public static void main(String[] args) {
        int[] nums = {8, 10, 22, 55};
        int target = 77;
        int[] indices = twoSum(nums, target);
        System.out.println(Arrays.toString(indices));  // Saída: [0, 1], pois nums[0] + nums[1] = 2 + 7 = 9
    }
}
