import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//Time: O(n), Space: O(n)
public class HW2_LC6 {
    public static int[] tansform(String s){
        Map<Character,Integer> map = new HashMap<>();
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            arr[i] = map.get(s.charAt(i));
        }
        return arr;
    }

    public static boolean isIsomorphic(String s, String t){
        return Arrays.equals(tansform(s),tansform(t));
    }
}
