public class HW2_LC10 {
    //Time: O(n)   Space: O(1)
    public static int compress(char[] chars){
        if(chars.length == 1){
            return 1;
        }
        StringBuilder s = new StringBuilder();
        int count = 0;
        char base = chars[0];
        for(int i=0; i<chars.length;i++){
            if(base == chars[i]){
                count++;
            }else if(base != chars[i]) {
                s.append(base);
                if(count != 1){
                    s.append(count);
                }
                base = chars[i];
                count = 1;
            }
        }
        s.append(base);
        if(count != 1){
            s.append(count);
        }
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
