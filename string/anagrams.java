package string;

public class anagrams {
 
    public static Boolean anagramCheck(String str1,String str2){
        if(str1.length() == str2.length()){
            for(int i=0;i<str1.length();i++){
                if(!str1.contains((String.valueOf(str2.charAt(i))))){
                    return false;
 
                }

            }
        }
             return true;
        }
       
      
        public static void main(String ar[]){
        String str1 = new String("care");
        String str2 = new String("race");
        boolean result  = anagramCheck(str1,str2);
        System.out.print((result)?"Anagrams":"Not Anagrams");
    }
}
