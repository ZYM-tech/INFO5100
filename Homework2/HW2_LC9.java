import java.util.ArrayList;
//Time: O(n)  Space: O(n)
public class HW2_LC9 {
    public static String reverseWords(String s){
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isSpaceChar(s.charAt(i))){
                if(word.toString().length()!=0){
                    arr.add(word.toString());
                    word.delete(0,word.length());
                }
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(i))){
                word.append(s.charAt(i));
            }
        }
        if(word.toString().length()!=0){
            arr.add(word.toString());
            word.delete(0,word.length());
        }
        //StringBuilder res = new StringBuilder(arr.size());
        for(int j=arr.size()-1; j>=0;j--){
            word.append(arr.get(j));
            word.append(" ");
        }
        word.deleteCharAt(word.length()-1);
        return word.toString();
    }
}
