public class HW2_LC4 {
    public static void rotateImg(int[][] matrix){
        int side = matrix.length;
        int left = 0;
        int right = matrix.length - 1;
        while(left<right){
            int[] temp = matrix[right];
            matrix[right] = matrix[left];
            matrix[left] = temp;
            left++;
            right--;
        }
        for(int i=0; i<side;i++){
            for(int k=i+1;k<side;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
}
