import java.util.*;

public class leap1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to be checked: ");
        int a = sc.nextInt();
        
         if(a%100 == 0 && a%400 == 0){
            System.out.print("it is a leap year");
         }
         else{
            if(a%4 == 0){
                System.out.print("it is a leap year");
            }
         }
}
    
}
