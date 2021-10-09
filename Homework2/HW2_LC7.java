public class HW2_LC7 {
    //Time: O(n)  Space: O(n)
    public static String addSum(String num1, String num2){
        StringBuilder res  = new StringBuilder();
        int carry =  0;
        int value =  0;
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        while(p1>=0||p2>=0){
            int x1,x2;
            if(p1<0){
                x1 = 0;
            }else{
                x1 = num1.charAt(p1)-'0';
            }

            if(p2<0){
                x2 = 0;
            }else{
                x2 =  num2.charAt(p2)-'0';
            }
            value = (x1+x2+carry)%10;
            carry =  (x1+x2+carry)/10;
            res.append(value);
            p1--;
            p2--;
        }
        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
