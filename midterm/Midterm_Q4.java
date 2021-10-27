import java.util.HashMap;
//Time: O(n) Space: O(n)
public class Midterm_Q4 {
    public static String LongestSubstring(String s) {
        int maxlong = 0;
        StringBuilder longstr = new StringBuilder();

        if(s.length() == 0){
            return null;
        }
        if(s.length() == 1){
            return s;
        }

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int i = 0;
        int m = 0;
        StringBuilder tempstr  = new StringBuilder();
        while(i<s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                tempstr.append(s.charAt(i));
                m++;
                if(maxlong < m){
                    maxlong = m;
                    longstr = new StringBuilder(tempstr);
                }
            }else{
                if(maxlong < m){
                    maxlong = m;
                    m = 0;
                    tempstr.delete(0,tempstr.length());
                }else{
                    m = 0;
                    tempstr.delete(0,tempstr.length());
                }
                i = map.get(s.charAt(i));
                map.clear();
            }
            i++;
        }
        return longstr.toString();
    }
}