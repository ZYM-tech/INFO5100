import java.util.*;
//Time: O(n) Space: O(n)
public class Q2 {
    public static List<List<String>> anagramsGroup(String[] word) {

        if (word.length == 0) {
            //List<List<String>> empty = new ArrayList<>();
            return new ArrayList<>();
        }

        Map<String, List> anagrams = new HashMap<String, List>();
        int[] bucket = new int[26];

        for (String n : word) {
            Arrays.fill(bucket, 0);

            for (char s: n.toCharArray()){
                bucket[s-'a']++;
            }

            StringBuilder strbuilder = new StringBuilder("");
            for (int i =0; i< 26; i++) {
                strbuilder.append('#');
                strbuilder.append(bucket[i]);
            }

            String data = strbuilder.toString();
            if (!anagrams.containsKey(data)) {
                anagrams.put(data, new ArrayList());
            }

            anagrams.get(data).add(n);
        }

        return new ArrayList(anagrams.values());
    }
}