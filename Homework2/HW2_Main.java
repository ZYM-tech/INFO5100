import java.util.Arrays;

public class HW2_Main {
    //region ShapeTester
    /*
    public static void main(String[] args){
        HW2_Q1.Shape shape1 = new HW2_Q1.Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        HW2_Q1.Shape shape2 = new HW2_Q1.Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter()); System.out.println(shape2.printShape());

        HW2_Q1.Rectangle rectangle1 = new HW2_Q1.Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        HW2_Q1.Rectangle rectangle2 = new HW2_Q1.Rectangle("Rectangle", "Purple",4, 7); System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter()); System.out.println(rectangle2.printShape());

        HW2_Q1.Square square1 = new HW2_Q1.Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        HW2_Q1.Square square2 = new HW2_Q1.Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter()); System.out.println(square2.printShape());
    }
    */
    ///endregion

    //region Sum tester
    /*
    public static void main(String[] args){
        HW2_Q2.Sum sum = new HW2_Q2.Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4
    }*/
    ///endregion

    public static void main(String[] args){
        //LeetCode 1 Test case
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(HW2_LC1.transpose(matrix)));

        //LeetCode 2 Test case
        String[] wordDict = new String[]{"practice","makes","perfect", "coding", "makes"};
        System.out.println(wordDict[0]);
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(HW2_LC2.distance(wordDict,word1,word2));

        //LeetCode 3  Test case
        int[] nums = {0,1,0,3,12};
        HW2_LC3.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        //LeetCode 4  Test case
        int[][] nums1 = {{1,2,3},{4,5,6},{7,8,9}};
        HW2_LC4.rotateImg(nums1);
        System.out.println(Arrays.deepToString(nums1));

        //LeetCode 5  Test case
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(HW2_LC5.spiral(matrix1).toArray()));

        //LeetCode 6  Test case
        String s = "egg";
        String t = "add";
        System.out.println(HW2_LC6.isIsomorphic(s,t));
    }
}
