public class Question4 {
    public static boolean isContain(String s, String t){
        int[] bucket = new int[26];
        for(int i=0; i<t.length();i++){
            bucket[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            bucket[s.charAt(i)-'a']--;
        }
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]<0){
                return false;
            }
        }
        return true;
    }
}
