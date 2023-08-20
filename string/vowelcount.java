package string;

import java.util.Scanner;

public class vowelcount {
   
    public static int countVowel(String sentence){
        int v=0;
        String vowel = "AEIOU";
        String newstrt =  sentence.toUpperCase();
        // System.out.println(newstrt);
        for(int i=0;i<vowel.length();i++){
            if (newstrt.contains((String.valueOf(vowel.charAt(i))))){
                v++;
            }
        }
        return v;
    }
     public static void main(String aa[]){
        Scanner sc = new Scanner(System.in);
        String value  =  sc.nextLine();
        System.out.print(countVowel(value));
     }
}
