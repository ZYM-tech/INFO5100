import java.util.HashMap;

//Time: O(n) Space:O(n)
public class Q3 {
    public int SumSubarray(int k, int[] nums) {
        int sum = 0;
        int res = 0;

        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0, 1);

        for (int i= 0; i< nums.length; i++) {
            sum = sum + nums[i];
            if (m.containsKey(sum - k)){
                res = res + m.get(sum - k);
            }
            int q = m.getOrDefault(sum, 0);
            m.put(sum, q+1);
        }
        return res;
    }
}