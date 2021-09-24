import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //Question 1 Testcase
        int[] nums1 = {1,2,3,4,5};
        System.out.println("Question 1: "+ Question1.sum(nums1));

        //Question 2 Testcase
        int[] nums2 = {-7,-3,2,3,11};
        System.out.println("Question 2: "+ Arrays.toString(Question2.sqsort(nums2)));

        //Question 3 Testcase
        int[] nums3 = {2,3,4,2,2,3,5,7};
        System.out.println("Question 3: "+ Question3.firstNonRepeated(nums3));

        //Question 4 Testcase
        String s = "ab";
        String t = "abc";
        System.out.println(Question4.isContain(s,t));
    }
}
