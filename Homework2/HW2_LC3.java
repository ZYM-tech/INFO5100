import java.util.ArrayList;
public class HW2_LC3 {
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            result.add(nums[i]);
        }
        int count = 0;
        for(int i=0; i<result.size();i++){
            if(result.get(i) == 0){
                result.remove(i);
                i--;
                count++;
            }
        }
        while(count >0 ){
            result.add(0);
            count--;
        }
        int i=0;
        for(int k : result){
            nums[i] = k;
            i++;
        }
    }
}
