public class Q3_Main {
    public static void main(String[] args){
        int k = 2;
        int nums[] = {1,1,1};

        int m = 3;
        int nums2[] = {1,2,3};

        Q3 qq = new Q3();
        System.out.println(qq.SumSubarray(k,nums));
        System.out.println(qq.SumSubarray(m,nums2));
    }
}
