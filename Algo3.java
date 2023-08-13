import java.lang.reflect.Array;
import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] nums2 = new int[5];
        
            
                for(int i=0;i<nums2.length;i++){
                nums2[i]=nums[nums.length-1-i];

     
        }nums=nums2;
        System.out.println(Arrays.toString(nums));
            

    }
}
