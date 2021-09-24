public class Question2 {
    public static int[] sqsort(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int i = nums.length-1;
        int[] arr = new  int[nums.length];
        while(left <= right){
            if(nums[left]+nums[right]<0){
                arr[i] = nums[left]*nums[left];
                i--;
                left++;
            }else if(nums[left]+nums[right]>=0){
                arr[i] = nums[right]*nums[right];
                i--;
                right--;
            }
        }
        return arr;
    }
}