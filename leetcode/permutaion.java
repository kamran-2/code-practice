package leetcode;
 
public class permutaion {

     public static void StringPermutaion(String str, String ans){
        if(str.length()==0) {
           System.out.println(ans);
           return;
        }
        for (int i = 0 ;i<str.length();i++){
            char temp=str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            StringPermutaion(newStr, ans+temp);
        }
     
     }
      public static void main(String arr[]){
        String str = "abc";
        StringPermutaion(str, "" );
    }
}
