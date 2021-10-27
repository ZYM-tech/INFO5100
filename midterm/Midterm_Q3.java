import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Time: O(n) Space: O(n)
public class Midterm_Q3 {
    public static int sumOfRepeat(int[] nums) {

        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr  =  new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                arr.add(nums[i]);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],1)+1);
            }
        }

        for(int i : arr){
            if(map.get(i)>1){
                res = res + i;
            }
        }
        return res;
    }
}