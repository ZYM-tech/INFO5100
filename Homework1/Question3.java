public class Question3 {
    public static  int firstNonRepeated(int[] nums){
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int k = 0; k<nums.length;k++){
                if(nums[k]==nums[i]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return 0;
    }
}
