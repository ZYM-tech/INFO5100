import java.util.ArrayList;
import java.util.Arrays;

public class HW2_LC2 {
    public static int distance(String[] wordsDict, String word1, String word2){
        int point1 = -1;
        int point2 = -1;
        int mindistance = wordsDict.length;

        for(int i=0; i<wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                point1 = i;
            }
            if(wordsDict[i].equals(word2)){
                point2 = i;
            }
            if(point1 != -1 && point2 != -1){
                mindistance = Math.min(mindistance, Math.abs(point2-point1));
            }
        }
        return mindistance;
    }
}
