package array;
import java.util.*;
public class largestnumber {
    public static int number(int num[]){
        int max = Integer.MIN_VALUE;
        for (int i=0 ;i<num.length;i++){
            if(num[i]>max){
                max =num[i];
            }       
    }
    return max;    
    }
    public static void main(String a[]){
        int num[] = {5,66,8,7,10};
        System.out.println("The maximum element in the array is "+number(num));
        }
}
