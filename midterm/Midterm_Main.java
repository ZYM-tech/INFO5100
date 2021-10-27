import Midterm_Q1.Fiction;

public class Midterm_Main {
    public static void main(String[] args) {
        //Question 1
        Fiction f1 = new Fiction("Fiction", 2.2,"2009");
        System.out.println(f1.description());

        //Question 2
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();
        p1.getConnection();

        //Question 3
        int[] nums = {1,3,-1,3,4,-1};
        System.out.println(Midterm_Q3.sumOfRepeat(nums));

        //Question 4
        String s = "abcabcbb";
        System.out.println(Midterm_Q4.LongestSubstring(s));
    }
}