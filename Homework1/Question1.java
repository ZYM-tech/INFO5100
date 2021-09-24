public class Question1 {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == nums[i]) { //count how many same number
                    count++;
                }
            }
            if (count == 1) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
