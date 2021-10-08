import java.util.ArrayList;
import java.util.List;

public class HW2_LC5 {
    public static List<Integer> spiral(int[][] matrix){
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;

        while(true){
            for(int i=left; i<=right; i++){
                arr.add(matrix[top][i]);
            }
            top++;
            if(top > down) break;

            for(int i=top; i<=down;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(left > right) break;

            for(int i= right; i>=left; i--){
                arr.add(matrix[down][i]);
            }
            down--;
            if (top > down) break;

            for(int i=down;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;
            if(left > right) break;
        }
        return arr;
    }
}
