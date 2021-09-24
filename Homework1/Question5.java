public class Question5 {
    public static boolean isFollowedDigit(String str){
        //str.length<=2
        if(str.length()==0 || str.length()==1){
           return true;
        }
        if(str.length()==2){
            if(str.charAt(0) >= 48 && str.charAt(0)<=57){
                if((str.charAt(1) >= 65 && str.charAt(1)<=90) || (str.charAt(1) >= 97 && str.charAt(1)<= 122)){
                    return true;
                }
            }
            if((str.charAt(0) >= 65 && str.charAt(0)<=90) || (str.charAt(0) >= 97 && str.charAt(0)<= 122)){
                if(str.charAt(1) >= 48 && str.charAt(1)<=57){
                    return true;
                }
            }
        }
        //str.length>2
        if(str.length()>2){
            for(int i=0; i<str.length()-2;i++){
                //charAt(i) is digit
                if(str.charAt(i) >= 48 && str.charAt(i)<=57){
                    if((str.charAt(i+1) >= 65 && str.charAt(i+1)<=90) || (str.charAt(i+1) >= 97 && str.charAt(i+1)<= 122)){
                        if(str.charAt(i+2) >= 48 && str.charAt(i+2)<=57){
                        }else return false;
                    }else return false;
                }
                //charAt(i) is letter
                if((str.charAt(i) >= 65 && str.charAt(i)<=90) || (str.charAt(i) >= 97 && str.charAt(i)<= 122)){
                    if(str.charAt(i+1) >= 48 && str.charAt(i+1)<=57){
                        if((str.charAt(i+2) >= 65 && str.charAt(i+2)<=90) || (str.charAt(i+2) >= 97 && str.charAt(i+2)<= 122)){
                        }else return false;
                    }else return false;
                }
            }
        }
        return true;
    }
}
