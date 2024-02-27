import java.util.Arrays;

public class RemoveDuplicates26 {
    //No pasa los test, pero da, buscar qué le pasa
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println("--------------------------");
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println("--------------------------");
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int[] aux = new int[nums.length];
        Arrays.fill(aux,101);
        int count = 0, index = 0;
        for(int number:nums){
            if(!isInVector(aux,number)){
                aux[index++] = number;
                count++;
            }
        }
        int[] result = new int[count];
        for(int i = 0; i < aux.length;i++){
            if(aux[i] == 101) break;
            result[i] = aux[i];
        }
        nums = new int[result.length];
        System.arraycopy(result,0,nums,0,result.length);
        System.out.println(Arrays.toString(nums));
        return count++;
    }

    private static boolean isInVector(int[] array, int num){
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == num) return true;
        }
        return false;
    }
}
