//Time: O(n^2) Space: O(n^2)
public class HW2_LC1 {
    public static int[][] transpose(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        for(int i=0; i<n; i++){
            for(int k=0; k<m; k++){
                result[i][k] = matrix[k][i];
            }
        }
        return result;
    }
}
