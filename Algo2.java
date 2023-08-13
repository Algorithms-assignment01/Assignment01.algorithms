public class Algo2 {
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
        int min=nums[0];
        int max=0;
        int i=0;
        for(;i<nums.length;i++){
           if(nums[i]<min) min=nums[i];
           if(nums[i]>max) max=nums[i];
            
        }System.out.print("Smallest number is: "+min);
            System.out.println();
            System.out.print("Largest number is: "+max);
            System.out.println();
    }
}
